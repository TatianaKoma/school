INSERT INTO subjects(id, name)
VALUES ('maths'),
       ('reading'),
       ('writing'),
       ('english');

INSERT INTO teachers(name, surname, start_date)
VALUES ('Irina', 'Koroseva', '2000-09-01T09:00:00+01:00'),
       ('Lev', 'Fridman', '2019-09-01T09:00:00+01:00'),
       ('Tamara', 'Mishina', '2016-09-01T09:00:00+01:00');

INSERT INTO groups (name, teacher_id)
VALUES ('1A', '5d371d6c-7d15-470e-be73-844fdb7a0e06'),
       ('1B', 'c125d15a-4c9c-4231-a9e5-b82b9398cd29'),
       ('2A', '83a2f16e-c714-45c9-a72c-28d9e5eb14cf');

INSERT INTO students (name, surname, start_date, group_id)
VALUES ('Igor', 'Petrov', '2022-09-01T09:00:00+01:00', 'b31fe8ed-c37a-4815-8c2a-4c413d8b138a'),
       ('Oleg', 'Ivanov', '2022-09-01T09:00:00+01:00', 'b31fe8ed-c37a-4815-8c2a-4c413d8b138a'),
       ('Maxim', 'Svetlov', '2022-09-01T09:00:00+01:00', 'b31fe8ed-c37a-4815-8c2a-4c413d8b138a'),
       ('Irina', 'Kasanova', '2022-09-01T09:00:00+01:00', 'db0a3bff-2e9d-4835-8139-a9601f5e75da'),
       ('Svetlana', 'Limova', '2022-09-01T09:00:00+01:00', 'db0a3bff-2e9d-4835-8139-a9601f5e75da'),
       ('Maria', 'Belova', '2022-09-01T09:00:00+01:00', 'db0a3bff-2e9d-4835-8139-a9601f5e75da'),
       ('Elena', 'Kolesova', '2022-09-01T09:00:00+01:00', '0f020adb-3cd0-46d7-8529-29d735235477'),
       ('Olexandr', 'Litvinov', '2022-09-01T09:00:00+01:00', '0f020adb-3cd0-46d7-8529-29d735235477'),
       ('Sophia', 'Minina', '2022-09-01T09:00:00+01:00', '0f020adb-3cd0-46d7-8529-29d735235477');

INSERT INTO lessons(subject_id, teacher_id, group_id, topic, start_date)
VALUES ('a720cc69-6546-4607-b664-2ce1601f7d49', '5d371d6c-7d15-470e-be73-844fdb7a0e06',
        'b31fe8ed-c37a-4815-8c2a-4c413d8b138a', 'Addition', '2022-09-21T11:00:00+01:00'),
       ('71732212-2e41-47d0-9425-f9c3ce979f1b', '83a2f16e-c714-45c9-a72c-28d9e5eb14cf',
        'db0a3bff-2e9d-4835-8139-a9601f5e75da', 'Alphabet', '2022-09-21T11:00:00+01:00'),
       ('c1da5d31-b2f0-429a-b773-c3324cd5b540', 'c125d15a-4c9c-4231-a9e5-b82b9398cd29',
        '0f020adb-3cd0-46d7-8529-29d735235477', 'Articles', '2022-09-17T12:30:00+01:00');

INSERT INTO activities (lesson_id, student_id, mark, is_present)
VALUES ('313832ff-a5b5-4463-8817-d87ae377523e', 'a6ae5189-f528-4bed-837a-c4d56cf9b6bb', 12, true),
       ('e824617f-2231-43db-96e1-350d1ebbacef', '085fc066-113c-4065-93cc-d3ab16bcf4e7', 10, true),
       ('ac62087a-b0d8-42a5-baa9-759be486bee0', '092cc6bb-2e10-496d-848e-3580d12fe3d6', null, false),
       ('313832ff-a5b5-4463-8817-d87ae377523e', '085fc066-113c-4065-93cc-d3ab16bcf4e7', null, false),
       ('ac62087a-b0d8-42a5-baa9-759be486bee0', '085fc066-113c-4065-93cc-d3ab16bcf4e7', null, false),
       ('ac62087a-b0d8-42a5-baa9-759be486bee0', 'd98cd650-c82f-4db4-a81d-b1c50a16fbce', 9, true),
       ('ac62087a-b0d8-42a5-baa9-759be486bee0', '092cc6bb-2e10-496d-848e-3580d12fe3d6', 5, true),
       ('313832ff-a5b5-4463-8817-d87ae377523e', '092cc6bb-2e10-496d-848e-3580d12fe3d6', null, false);
