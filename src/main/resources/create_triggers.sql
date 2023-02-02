--      trigger SQL  - avoid adding student for not valid lesson
--      and avoid adding mark with isPresent = false
CREATE OR REPLACE FUNCTION before_insert()
    RETURNS TRIGGER AS
$$
BEGIN

--     SELECT l.group_id
--     FROM lessons AS l
--     WHERE lesson_id = NEW.lesson_id;
--
--     SELECT s.group_id
--     FROM students AS s
--     WHERE student_id = NEW.student_id;
--
--     IF l.group_id = s.group_id THEN
--         RAISE EXCEPTION 'this student can not be present at this lesson';
--     END IF;

    IF NEW.is_present = false AND NEW.mark IS NOT NULL THEN
        RAISE EXCEPTION 'this student can not have any mark, because he is absent';
    END IF;
    RETURN NEW;
END ;
$$ LANGUAGE plpgsql;

-- DROP TRIGGER IF EXISTS trigger_before_insert ON activities;
CREATE TRIGGER trigger_before_insert
    BEFORE INSERT OR UPDATE
    ON activities
    FOR EACH ROW
EXECUTE PROCEDURE before_insert();
