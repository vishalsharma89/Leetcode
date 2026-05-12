# Write your MySQL query statement below
SELECT S.student_id, S.student_name, Su.subject_name,
COUNT(e.student_id) as attended_exams 
FROM Students S
CROSS JOIN Subjects Su
LEFT JOIN Examinations  e
ON 
S.student_id = e.student_id AND Su.subject_name  = e.subject_name
GROUP BY S.student_id, Su.subject_name
ORDER BY student_id ASC, subject_name ASC