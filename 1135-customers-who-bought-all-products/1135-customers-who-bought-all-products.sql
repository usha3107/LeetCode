# Write your MySQL query statement below
# Write your MySQL query statement below
-- select product_key
-- from Product;
select customer_id
from Customer
group by customer_id
having  count(distinct product_key) in(
    select count(distinct product_key) as total_prods
    from Product
);