SELECT student_id, COUNT(ALL is_present) as truants
FROM activities
WHERE is_present = false
GROUP BY student_id
ORDER BY truants DESC
LIMIT 1;

WITH truants AS (SELECT student_id,
                        COUNT(ALL is_present) as truancies,
                        DENSE_RANK() OVER (
                            ORDER BY COUNT(ALL is_present) DESC
                            )                    truancies_rank
                 FROM activities
                 WHERE is_present = false
                 GROUP BY student_id)
SELECT student_id, truancies
FROM truants
WHERE truancies_rank = 1;

WITH truants AS (SELECT student_id,
                        COUNT(ALL is_present) as truancies,
                        DENSE_RANK() OVER (
                            ORDER BY COUNT(ALL is_present) DESC
                            )                    truancies_rank
                 FROM activities AS a
                          JOIN students AS s ON s.id = a.student_id
                 WHERE is_present = false
                   AND s.group_id = 'b31fe8ed-c37a-4815-8c2a-4c413d8b138a'
                 GROUP BY student_id)
SELECT student_id, truancies
FROM truants
WHERE truancies_rank = 1;

SELECT student_id, AVG(COALESCE(mark,0)) AS avg_mark
FROM activities
GROUP BY student_id
ORDER BY avg_mark DESC
LIMIT 3;