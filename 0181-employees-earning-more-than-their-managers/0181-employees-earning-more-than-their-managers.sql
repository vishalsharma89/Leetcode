# Write your MySQL query statement below
-- SELECT name AS Employee FROM Employee
-- WHERE Employee.Salary>(SELECT Salary FROM Employee AS E2
-- WHERE Id = Employee.ManagerId);

SELECT e1.name AS Employee
FROM Employee e1
JOIN Employee e2 ON e1.managerId = e2.id
WHERE e1.salary > e2.salary;