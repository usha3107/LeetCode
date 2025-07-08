# Write your MySQL query statement below
Select employee_id from Employees e WHERE employee_id not in (Select employee_id from Salaries)
UNION
Select employee_id from salaries s WHERE employee_id not in (Select employee_id from Employees)
ORDER BY employee_id;