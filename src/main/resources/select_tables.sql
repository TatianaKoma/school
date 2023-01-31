-- select one student from the school who skipped the most lessons
SELECT a.student_id, COUNT(ALL a.is_present) as truants
FROM activities AS a
WHERE a.is_present = false
GROUP BY a.student_id
ORDER BY truants DESC
LIMIT 1;

-- selects a list of students from the school who skipped the most lessons
WITH truants AS (SELECT a.student_id,
                        COUNT(ALL a.is_present) as truancies,
                        DENSE_RANK() OVER (
                            ORDER BY COUNT(ALL a.is_present) DESC
                            )                    truancies_rank
                 FROM activities AS a
                 WHERE a.is_present = false
                 GROUP BY a.student_id)
SELECT tr.student_id, tr.truancies
FROM truants AS tr
WHERE truancies_rank = 1;

-- select a list of students from the group who skipped the most lessons
WITH truants AS (SELECT a.student_id,
                        COUNT(ALL a.is_present) as truancies,
                        DENSE_RANK() OVER (
                            ORDER BY COUNT(ALL a.is_present) DESC
                            )                    truancies_rank
                 FROM activities AS a
                          JOIN students AS s ON s.id = a.student_id
                 WHERE a.is_present = false
                   AND s.group_id = 'b31fe8ed-c37a-4815-8c2a-4c413d8b138a'
                 GROUP BY a.student_id)
SELECT tr.student_id, tr.truancies
FROM truants AS tr
WHERE truancies_rank = 1;

-- select a top 3 students from the school who has higher average mark
SELECT a.student_id, AVG(COALESCE(a.mark, 0)) AS avg_mark
FROM activities AS a
GROUP BY a.student_id
ORDER BY avg_mark DESC
LIMIT 3;

-- select a top 3 students from the group who has higher average mark
SELECT a.student_id, AVG(COALESCE(a.mark, 0)) AS avg_mark
FROM activities AS a
         JOIN students AS s ON s.id = a.student_id
WHERE s.group_id = 'db0a3bff-2e9d-4835-8139-a9601f5e75da'
GROUP BY a.student_id
ORDER BY avg_mark DESC
LIMIT 3;

--select a list of students who was absent at specific date
SELECT a.student_id
FROM activities AS a
         JOIN lessons AS l on l.id = a.lesson_id
WHERE a.is_present = false
  AND l.start_date = '2022-09-17 11:30:00.000000 +00:00';
