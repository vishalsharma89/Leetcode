# Write your MySQL query statement below
-- SELECT name AS Employee FROM Employee
-- WHERE Employee.Salary>(SELECT Salary FROM Employee AS E2
-- WHERE Id = Employee.ManagerId);

SELECT m.name AS Employee
FROM Employee e
INNER JOIN Employee m
ON e.id = m.managerId
WHERE e.salary<m.salary