SELECT student_id, COUNT(ALL is_present) as truants
FROM activities
WHERE is_present = false
GROUP BY student_id
ORDER BY truants DESC
LIMIT 1;

WITH cte AS (SELECT student_id,
                    COUNT(ALL is_present) as truants,
                    DENSE_RANK() OVER (
                        ORDER BY COUNT(ALL is_present) DESC
                        ) truants_rank
             FROM activities
             WHERE is_present=false
             group by student_id)
SELECT student_id, truants
FROM cte
WHERE truants_rank = 1;
