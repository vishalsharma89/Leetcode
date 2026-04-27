# Write your MySQL query statement below
-- SELECT salary as SecondHighestSalary 
-- FROM
-- (
--     SELECT salary, DENSE_RANK() OVER(ORDER BY salary DESC) AS rnk
--     FROM Employee
-- ) AS ranked
-- WHERE rnk=2;

SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary <
(
    SELECT MAX(salary)
    FROM Employee
);