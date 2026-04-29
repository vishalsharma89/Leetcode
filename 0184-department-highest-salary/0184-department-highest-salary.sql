# Write your MySQL query statement below
SELECT d.name AS Department,
    sal.name AS Employee,
    sal.salary AS Salary
FROM (
    SELECT name, Salary, departmentId,
    DENSE_RANK() OVER(PARTITION BY departmentId ORDER BY Salary DESC) AS rnk
    FROM Employee
) sal
JOIN Department d
ON sal.departmentId = d.id
WHERE rnk =1;