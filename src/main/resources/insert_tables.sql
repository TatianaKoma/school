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
        'b31fe8ed-c37a-4815-8c2a-4c413d8b138a', 'Addition', '2022-09-21T09:00:00+01:00'),
       ('71732212-2e41-47d0-9425-f9c3ce979f1b', '5d371d6c-7d15-470e-be73-844fdb7a0e06',
        'b31fe8ed-c37a-4815-8c2a-4c413d8b138a', 'Alphabet', '2022-09-21T10:00:00+01:00'),
       ('c1da5d31-b2f0-429a-b773-c3324cd5b540', 'c125d15a-4c9c-4231-a9e5-b82b9398cd29',
        'b31fe8ed-c37a-4815-8c2a-4c413d8b138a', 'Articles', '2022-09-21T11:00:00+01:00'),

       ('a720cc69-6546-4607-b664-2ce1601f7d49', '83a2f16e-c714-45c9-a72c-28d9e5eb14cf',
        'db0a3bff-2e9d-4835-8139-a9601f5e75da', 'Addition', '2022-09-21T09:00:00+01:00'),
       ('71732212-2e41-47d0-9425-f9c3ce979f1b', '83a2f16e-c714-45c9-a72c-28d9e5eb14cf',
        'db0a3bff-2e9d-4835-8139-a9601f5e75da', 'Alphabet', '2022-09-21T11:00:00+01:00'),
       ('c1da5d31-b2f0-429a-b773-c3324cd5b540', 'c125d15a-4c9c-4231-a9e5-b82b9398cd29',
        'db0a3bff-2e9d-4835-8139-a9601f5e75da', 'Articles', '2022-09-21T10:00:00+01:00'),

       ('a720cc69-6546-4607-b664-2ce1601f7d49', '83a2f16e-c714-45c9-a72c-28d9e5eb14cf',
        '0f020adb-3cd0-46d7-8529-29d735235477', 'Equations', '2022-09-22T09:00:00+01:00'),
       ('92bf1924-314b-4b5d-ba41-a4e5c5c38f8e', '5d371d6c-7d15-470e-be73-844fdb7a0e06',
        '0f020adb-3cd0-46d7-8529-29d735235477', 'Animal stories', '2022-09-22T10:00:00+01:00'),
       ('71732212-2e41-47d0-9425-f9c3ce979f1b', 'c125d15a-4c9c-4231-a9e5-b82b9398cd29',
        '0f020adb-3cd0-46d7-8529-29d735235477', 'Parts of speech', '2022-09-22T11:00:00+01:00');

INSERT INTO activities (lesson_id, student_id, mark, is_present)
VALUES ('281ba1dd-cda9-4c6e-846f-c67b30c20de1', 'a6ae5189-f528-4bed-837a-c4d56cf9b6bb', 12, true),
       ('76c7384a-fd17-43c0-bbc2-75696823dfd0', 'a6ae5189-f528-4bed-837a-c4d56cf9b6bb', 12, true),
       ('3f91b22e-b89c-4acc-a44b-f328d47336fd', 'a6ae5189-f528-4bed-837a-c4d56cf9b6bb', 12, true),

       ('281ba1dd-cda9-4c6e-846f-c67b30c20de1', '085fc066-113c-4065-93cc-d3ab16bcf4e7', 10, true),
       ('76c7384a-fd17-43c0-bbc2-75696823dfd0', '085fc066-113c-4065-93cc-d3ab16bcf4e7', 10, true),
       ('3f91b22e-b89c-4acc-a44b-f328d47336fd', '085fc066-113c-4065-93cc-d3ab16bcf4e7', 10, true),

       ('281ba1dd-cda9-4c6e-846f-c67b30c20de1', 'b59cbbb6-ab12-441b-8f1f-e7dcdffd2010', 12, true),
       ('76c7384a-fd17-43c0-bbc2-75696823dfd0', 'b59cbbb6-ab12-441b-8f1f-e7dcdffd2010', null, false),
       ('3f91b22e-b89c-4acc-a44b-f328d47336fd', 'b59cbbb6-ab12-441b-8f1f-e7dcdffd2010', null, false),

       ('17128549-528b-456f-b53c-02135d319608', '0e16ddd0-a9f3-4f5e-901b-824808cd4aa3', null, false),
       ('2ab294fc-7d4b-4d41-ad56-ba183f251b7a', '0e16ddd0-a9f3-4f5e-901b-824808cd4aa3', null, false),
       ('320c92ce-2921-4be4-bc82-48c8baa463f5', '0e16ddd0-a9f3-4f5e-901b-824808cd4aa3', null, false),

       ('17128549-528b-456f-b53c-02135d319608', 'bae0921b-f143-4ce8-ac0d-6b56b68de7da', 7, true),
       ('2ab294fc-7d4b-4d41-ad56-ba183f251b7a', 'bae0921b-f143-4ce8-ac0d-6b56b68de7da', 6, true),
       ('320c92ce-2921-4be4-bc82-48c8baa463f5', 'bae0921b-f143-4ce8-ac0d-6b56b68de7da', 5, true),

       ('17128549-528b-456f-b53c-02135d319608', 'd98cd650-c82f-4db4-a81d-b1c50a16fbce', 10, true),
       ('2ab294fc-7d4b-4d41-ad56-ba183f251b7a', 'd98cd650-c82f-4db4-a81d-b1c50a16fbce', 9, true),
       ('320c92ce-2921-4be4-bc82-48c8baa463f5', 'd98cd650-c82f-4db4-a81d-b1c50a16fbce', 5, true),

       ('636505be-e092-452e-8410-c6789cb4026f', '092cc6bb-2e10-496d-848e-3580d12fe3d6', 12, true),
       ('8ee73399-3d62-4c16-9531-abd21553fde2', '092cc6bb-2e10-496d-848e-3580d12fe3d6', 10, true),
       ('6aed2872-0756-40c8-8827-d835f666f3fe', '092cc6bb-2e10-496d-848e-3580d12fe3d6', null, true),

       ('636505be-e092-452e-8410-c6789cb4026f', '18eee600-30d1-436c-a213-2886668f81cd', 5, true),
       ('8ee73399-3d62-4c16-9531-abd21553fde2', '18eee600-30d1-436c-a213-2886668f81cd', null, false),
       ('6aed2872-0756-40c8-8827-d835f666f3fe', '18eee600-30d1-436c-a213-2886668f81cd', 6, true),

       ('636505be-e092-452e-8410-c6789cb4026f', '7c2938f7-43f2-462d-b59a-4d1ad34f7060', 12, true),
       ('8ee73399-3d62-4c16-9531-abd21553fde2', '7c2938f7-43f2-462d-b59a-4d1ad34f7060', 9, true),
       ('6aed2872-0756-40c8-8827-d835f666f3fe', '7c2938f7-43f2-462d-b59a-4d1ad34f7060', null, false);

INSERT INTO activities (lesson_id, student_id, mark, is_present)
VALUES ('6aed2872-0756-40c8-8827-d835f666f3fe', '7c2938f7-43f2-462d-b59a-4d1ad34f7060', 10, false);

UPDATE activities
SET mark= 10, is_present= false
WHERE id = '8f26391f-2503-4f7f-9418-c835f2ab568b';

INSERT INTO activities (lesson_id, student_id, mark, is_present)
VALUES ('281ba1dd-cda9-4c6e-846f-c67b30c20de1', '7c2938f7-43f2-462d-b59a-4d1ad34f7060', 10, true);

UPDATE activities
SET lesson_id ='281ba1dd-cda9-4c6e-846f-c67b30c20de1', student_id = '7c2938f7-43f2-462d-b59a-4d1ad34f7060'
WHERE id = '8f26391f-2503-4f7f-9418-c835f2ab568b';