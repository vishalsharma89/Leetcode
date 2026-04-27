# Write your MySQL query statement below
-- SELECT 

-- FROM
-- (
--     SELECT num, DENSE_RANK() OVER(ORDER BY salary DESC) AS rnk
--     FROM Employee
-- ) AS ranked
-- WHERE rnk=2

SELECT DISTINCT l1.num AS ConsecutiveNums
FROM logs l1
JOIN logs l2
    ON l1.id +1 =l2.id
JOIN logs l3
    ON l2.id +1 = l3.id
WHERE l1.num = l2.num
AND l2.num = l3.num

