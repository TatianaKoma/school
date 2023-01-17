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
                               )                   truancies_rank
                    FROM activities
                    WHERE is_present = false
                    GROUP BY student_id)
SELECT student_id, truancies
FROM truants
WHERE truancies_rank = 1;
