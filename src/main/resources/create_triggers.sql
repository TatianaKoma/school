--  trigger SQL avoid adding mark with isPresent = false
CREATE OR REPLACE FUNCTION before_insert_mark()
    RETURNS TRIGGER AS
$$
BEGIN
    IF NEW.is_present = false AND NEW.mark IS NOT NULL THEN
        RAISE EXCEPTION 'this student can not have any mark, because he is absent';
    END IF;
    RETURN NEW;
END ;
$$ LANGUAGE plpgsql;

DROP TRIGGER IF EXISTS trigger_before_insert_mark ON activities;
CREATE TRIGGER trigger_before_insert_mark
    BEFORE INSERT OR UPDATE
    ON activities
    FOR EACH ROW
EXECUTE PROCEDURE before_insert_mark();

-- trigger SQL  - avoid adding student for not valid lesson
CREATE OR REPLACE FUNCTION before_insert_student()
    RETURNS TRIGGER AS
$$
BEGIN
    IF (SELECT l.group_id
        FROM lessons AS l
        WHERE l.id = NEW.lesson_id) !=
       (SELECT s.group_id
        FROM students AS s
        WHERE s.id = NEW.student_id)
    THEN
        RAISE EXCEPTION 'this student can not be present at this lesson';
    END IF;
    RETURN NEW;
END ;
$$ LANGUAGE plpgsql;

DROP TRIGGER IF EXISTS trigger_before_insert_student ON activities;
CREATE TRIGGER trigger_before_insert_student
    BEFORE INSERT OR UPDATE
    ON activities
    FOR EACH ROW
EXECUTE PROCEDURE before_insert_student();