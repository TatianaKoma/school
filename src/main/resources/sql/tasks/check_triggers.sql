INSERT INTO activities (id, lesson_id, student_id, mark, is_present)
VALUES ('8f26391f-2503-4f7f-9418-c835f2ab568b', '6aed2872-0756-40c8-8827-d835f666f3fe',
        '7c2938f7-43f2-462d-b59a-4d1ad34f7060', 10, false);

UPDATE activities
SET mark= 10,
    is_present= false
WHERE id = '8f26391f-2503-4f7f-9418-c835f2ab568b';

INSERT INTO activities (id, lesson_id, student_id, mark, is_present)
VALUES ('9f10f9fc-9971-4e57-af45-2407fb793f4f', '281ba1dd-cda9-4c6e-846f-c67b30c20de1',
        '7c2938f7-43f2-462d-b59a-4d1ad34f7060', 10, true);

UPDATE activities
SET lesson_id  ='281ba1dd-cda9-4c6e-846f-c67b30c20de1',
    student_id = '7c2938f7-43f2-462d-b59a-4d1ad34f7060'
WHERE id = '8f26391f-2503-4f7f-9418-c835f2ab568b';