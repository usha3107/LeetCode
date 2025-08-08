# Write your MySQL query statement below
# Write your MySQL query statement below

with cte as(select book_id,dense_rank() over(partition by book_id order by session_rating desc) as max_rank,
dense_rank() over(partition by book_id order by session_rating asc) as min_rank,
session_rating
from reading_sessions),
dte as(select book_id,count(book_id) as poloscore from reading_sessions where session_rating <= 2 or session_rating >=4 group by book_id),
ete as (select book_id,count(book_id) as total from reading_sessions group by book_id)


select b.book_id,b.title,b.author,b.genre,b.pages,(c.session_rating - d.session_rating) as rating_spread,round((p.poloscore/e.total),2) as polarization_score 
 
from books as b
join reading_sessions rs on b.book_id = rs.book_id 
join cte c on b.book_id = c.book_id and c.max_rank = 1
join cte d on b.book_id = d.book_id and d.min_rank = 1
join dte p on b.book_id = p.book_id
join ete e on b.book_id = e.book_id
where c.session_rating >= 4 and d.session_rating <= 2 and round((p.poloscore/e.total),2) >= 0.6 and e.total >= 5
group by e.book_id 
order by polarization_score desc,b.title desc