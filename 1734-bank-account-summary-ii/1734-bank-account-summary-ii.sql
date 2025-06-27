# Write your MySQL query statement below
SELECT u.name , 
SUM(t.amount) as balance 
FROM Users u
JOIN Transactions t On u.account = t.account
GROUP BY u.account
HAVING balance > 10000;