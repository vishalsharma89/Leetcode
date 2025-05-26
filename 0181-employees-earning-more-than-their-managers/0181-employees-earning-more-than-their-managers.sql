# Write your MySQL query statement below
SELECT name AS Employee FROM Employee
WHERE Employee.Salary>(SELECT Salary FROM Employee AS E2
WHERE Id = Employee.ManagerId);