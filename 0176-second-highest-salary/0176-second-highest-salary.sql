# Write your MySQL query statement below
SELECT 
(SELECT DISTINCT salary 
FROM
(
    SELECT salary, DENSE_RANK() OVER(ORDER BY salary DESC) AS rnk
    FROM Employee
) AS ranked
WHERE rnk=2
) AS SecondHighestSalary

-- SELECT MAX(salary) AS SecondHighestSalary
-- FROM Employee
-- WHERE salary <
-- (
--     SELECT MAX(salary)
--     FROM Employee
-- );