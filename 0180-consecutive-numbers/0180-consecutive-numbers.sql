# Write your MySQL query statement below
SELECT DISTINCT num AS ConsecutiveNums 
FROM
(
    SELECT num, 
    LAG(num,1) OVER(ORDER BY id DESC) AS prev1,
    LAG(num,2) OVER(ORDER BY id DESC) AS prev2
    FROM logs
) AS ranked
WHERE num = prev1
AND num = prev2;

-- SELECT DISTINCT l1.num AS ConsecutiveNums
-- FROM logs l1
-- JOIN logs l2
--     ON l1.id +1 =l2.id
-- JOIN logs l3
--     ON l2.id +1 = l3.id
-- WHERE l1.num = l2.num
-- AND l2.num = l3.num

