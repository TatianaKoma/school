INSERT INTO subjects(id, name)
VALUES ('a720cc69-6546-4607-b664-2ce1601f7d49', 'maths'),
       ('92bf1924-314b-4b5d-ba41-a4e5c5c38f8e', 'reading'),
       ('71732212-2e41-47d0-9425-f9c3ce979f1b', 'writing'),
       ('c1da5d31-b2f0-429a-b773-c3324cd5b540', 'english');

INSERT INTO teachers(id, name, surname, start_date)
VALUES ('5d371d6c-7d15-470e-be73-844fdb7a0e06', 'Irina', 'Koroseva', '2000-09-01T09:00:00+01:00'),
       ('c125d15a-4c9c-4231-a9e5-b82b9398cd29', 'Lev', 'Fridman', '2019-09-01T09:00:00+01:00'),
       ('83a2f16e-c714-45c9-a72c-28d9e5eb14cf', 'Tamara', 'Mishina', '2016-09-01T09:00:00+01:00');

INSERT INTO groups (id, name, teacher_id)
VALUES ('b31fe8ed-c37a-4815-8c2a-4c413d8b138a', '1A', '5d371d6c-7d15-470e-be73-844fdb7a0e06'),
       ('db0a3bff-2e9d-4835-8139-a9601f5e75da', '1B', 'c125d15a-4c9c-4231-a9e5-b82b9398cd29'),
       ('0f020adb-3cd0-46d7-8529-29d735235477', '2A', '83a2f16e-c714-45c9-a72c-28d9e5eb14cf');

INSERT INTO students (id, name, surname, start_date, group_id)
VALUES ('a6ae5189-f528-4bed-837a-c4d56cf9b6bb', 'Igor', 'Petrov', '2022-09-01T09:00:00+01:00',
        'b31fe8ed-c37a-4815-8c2a-4c413d8b138a'),
       ('085fc066-113c-4065-93cc-d3ab16bcf4e7', 'Oleg', 'Ivanov', '2022-09-01T09:00:00+01:00',
        'b31fe8ed-c37a-4815-8c2a-4c413d8b138a'),
       ('b59cbbb6-ab12-441b-8f1f-e7dcdffd2010', 'Maxim', 'Svetlov', '2022-09-01T09:00:00+01:00',
        'b31fe8ed-c37a-4815-8c2a-4c413d8b138a'),
       ('0e16ddd0-a9f3-4f5e-901b-824808cd4aa3', 'Irina', 'Kasanova', '2022-09-01T09:00:00+01:00',
        'db0a3bff-2e9d-4835-8139-a9601f5e75da'),
       ('bae0921b-f143-4ce8-ac0d-6b56b68de7da', 'Svetlana', 'Limova', '2022-09-01T09:00:00+01:00',
        'db0a3bff-2e9d-4835-8139-a9601f5e75da'),
       ('d98cd650-c82f-4db4-a81d-b1c50a16fbce', 'Maria', 'Belova', '2022-09-01T09:00:00+01:00',
        'db0a3bff-2e9d-4835-8139-a9601f5e75da'),
       ('092cc6bb-2e10-496d-848e-3580d12fe3d6', 'Elena', 'Kolesova', '2022-09-01T09:00:00+01:00',
        '0f020adb-3cd0-46d7-8529-29d735235477'),
       ('18eee600-30d1-436c-a213-2886668f81cd', 'Olexandr', 'Litvinov', '2022-09-01T09:00:00+01:00',
        '0f020adb-3cd0-46d7-8529-29d735235477'),
       ('7c2938f7-43f2-462d-b59a-4d1ad34f7060', 'Sophia', 'Minina', '2022-09-01T09:00:00+01:00',
        '0f020adb-3cd0-46d7-8529-29d735235477');

INSERT INTO lessons(id, subject_id, teacher_id, group_id, topic, start_date)
VALUES ('281ba1dd-cda9-4c6e-846f-c67b30c20de1', 'a720cc69-6546-4607-b664-2ce1601f7d49',
        '5d371d6c-7d15-470e-be73-844fdb7a0e06',
        'b31fe8ed-c37a-4815-8c2a-4c413d8b138a', 'Addition', '2022-09-21T09:00:00+01:00'),
       ('76c7384a-fd17-43c0-bbc2-75696823dfd0', '71732212-2e41-47d0-9425-f9c3ce979f1b',
        '5d371d6c-7d15-470e-be73-844fdb7a0e06',
        'b31fe8ed-c37a-4815-8c2a-4c413d8b138a', 'Alphabet', '2022-09-21T10:00:00+01:00'),
       ('3f91b22e-b89c-4acc-a44b-f328d47336fd', 'c1da5d31-b2f0-429a-b773-c3324cd5b540',
        'c125d15a-4c9c-4231-a9e5-b82b9398cd29',
        'b31fe8ed-c37a-4815-8c2a-4c413d8b138a', 'Articles', '2022-09-21T11:00:00+01:00'),

       ('17128549-528b-456f-b53c-02135d319608', 'a720cc69-6546-4607-b664-2ce1601f7d49',
        '83a2f16e-c714-45c9-a72c-28d9e5eb14cf',
        'db0a3bff-2e9d-4835-8139-a9601f5e75da', 'Addition', '2022-09-21T09:00:00+01:00'),
       ('2ab294fc-7d4b-4d41-ad56-ba183f251b7a', '71732212-2e41-47d0-9425-f9c3ce979f1b',
        '83a2f16e-c714-45c9-a72c-28d9e5eb14cf',
        'db0a3bff-2e9d-4835-8139-a9601f5e75da', 'Alphabet', '2022-09-21T11:00:00+01:00'),
       ('320c92ce-2921-4be4-bc82-48c8baa463f5', 'c1da5d31-b2f0-429a-b773-c3324cd5b540',
        'c125d15a-4c9c-4231-a9e5-b82b9398cd29',
        'db0a3bff-2e9d-4835-8139-a9601f5e75da', 'Articles', '2022-09-21T10:00:00+01:00'),

       ('636505be-e092-452e-8410-c6789cb4026f', 'a720cc69-6546-4607-b664-2ce1601f7d49',
        '83a2f16e-c714-45c9-a72c-28d9e5eb14cf',
        '0f020adb-3cd0-46d7-8529-29d735235477', 'Equations', '2022-09-22T09:00:00+01:00'),
       ('8ee73399-3d62-4c16-9531-abd21553fde2', '92bf1924-314b-4b5d-ba41-a4e5c5c38f8e',
        '5d371d6c-7d15-470e-be73-844fdb7a0e06',
        '0f020adb-3cd0-46d7-8529-29d735235477', 'Animal stories', '2022-09-22T10:00:00+01:00'),
       ('6aed2872-0756-40c8-8827-d835f666f3fe', '71732212-2e41-47d0-9425-f9c3ce979f1b',
        'c125d15a-4c9c-4231-a9e5-b82b9398cd29',
        '0f020adb-3cd0-46d7-8529-29d735235477', 'Parts of speech', '2022-09-22T11:00:00+01:00');

INSERT INTO activities (id, lesson_id, student_id, mark, is_present)
VALUES ('9f10f9fc-9971-4e57-af45-2407fb793f4f', '281ba1dd-cda9-4c6e-846f-c67b30c20de1',
        'a6ae5189-f528-4bed-837a-c4d56cf9b6bb', 12, true),
       ('f150dcc3-45d2-4eb0-a608-9bf12b1c65a1', '76c7384a-fd17-43c0-bbc2-75696823dfd0',
        'a6ae5189-f528-4bed-837a-c4d56cf9b6bb', 12, true),
       ('e67906d7-45e3-446e-9038-da1dfb3d5c6c', '3f91b22e-b89c-4acc-a44b-f328d47336fd',
        'a6ae5189-f528-4bed-837a-c4d56cf9b6bb', 12, true),

       ('bb7f9979-b4fd-4907-abd0-55731fc2bc05', '281ba1dd-cda9-4c6e-846f-c67b30c20de1',
        '085fc066-113c-4065-93cc-d3ab16bcf4e7', 10, true),
       ('7e3db2be-078c-47b5-9fd9-c93c5ba8b05d', '76c7384a-fd17-43c0-bbc2-75696823dfd0',
        '085fc066-113c-4065-93cc-d3ab16bcf4e7', 10, true),
       ('4c991a1a-bb23-41f3-9503-41334aac0d07', '3f91b22e-b89c-4acc-a44b-f328d47336fd',
        '085fc066-113c-4065-93cc-d3ab16bcf4e7', 10, true),

       ('39813b63-2050-4df7-9a64-8b29ab20a975', '281ba1dd-cda9-4c6e-846f-c67b30c20de1',
        'b59cbbb6-ab12-441b-8f1f-e7dcdffd2010', 12, true),
       ('e8d4b0bf-0d93-49a7-90c7-d300c713fba7', '76c7384a-fd17-43c0-bbc2-75696823dfd0',
        'b59cbbb6-ab12-441b-8f1f-e7dcdffd2010', null, false),
       ('04ac44b2-d4b6-4d98-81dd-095aa2e68216', '3f91b22e-b89c-4acc-a44b-f328d47336fd',
        'b59cbbb6-ab12-441b-8f1f-e7dcdffd2010', null, false),

       ('e1937dbd-9645-47ae-80a4-2ddabdf97c41', '17128549-528b-456f-b53c-02135d319608',
        '0e16ddd0-a9f3-4f5e-901b-824808cd4aa3', null, false),
       ('89d60654-f0ac-43af-82e7-966d594e3fad', '2ab294fc-7d4b-4d41-ad56-ba183f251b7a',
        '0e16ddd0-a9f3-4f5e-901b-824808cd4aa3', null, false),
       ('44c6ad98-7b1b-4b49-b062-b16a09f4f094', '320c92ce-2921-4be4-bc82-48c8baa463f5',
        '0e16ddd0-a9f3-4f5e-901b-824808cd4aa3', null, false),

       ('29a20378-357d-4ef6-842f-495a82cb222e', '17128549-528b-456f-b53c-02135d319608',
        'bae0921b-f143-4ce8-ac0d-6b56b68de7da', 7, true),
       ('53fcf53f-616f-40e4-bccd-a32f4e88e1c0', '2ab294fc-7d4b-4d41-ad56-ba183f251b7a',
        'bae0921b-f143-4ce8-ac0d-6b56b68de7da', 6, true),
       ('90cb3801-e281-4fc2-b050-d8f4845ff440', '320c92ce-2921-4be4-bc82-48c8baa463f5',
        'bae0921b-f143-4ce8-ac0d-6b56b68de7da', 5, true),

       ('71d4a88e-af12-40c6-baaf-86545915fa1b', '17128549-528b-456f-b53c-02135d319608',
        'd98cd650-c82f-4db4-a81d-b1c50a16fbce', 10, true),
       ('3ae183cd-fa6a-4178-8614-b328288a69a6', '2ab294fc-7d4b-4d41-ad56-ba183f251b7a',
        'd98cd650-c82f-4db4-a81d-b1c50a16fbce', 9, true),
       ('1d8b2d45-a119-4ba3-9ecd-27b6c5bedebe', '320c92ce-2921-4be4-bc82-48c8baa463f5',
        'd98cd650-c82f-4db4-a81d-b1c50a16fbce', 5, true),

       ('a063c490-e1d3-469b-8bee-2bac7d899ad4', '636505be-e092-452e-8410-c6789cb4026f',
        '092cc6bb-2e10-496d-848e-3580d12fe3d6', 12, true),
       ('09f18fd5-75e0-4243-9255-c3742d7a6e49', '8ee73399-3d62-4c16-9531-abd21553fde2',
        '092cc6bb-2e10-496d-848e-3580d12fe3d6', 10, true),
       ('31fe6b10-c383-4c07-9312-ba6ff9012686', '6aed2872-0756-40c8-8827-d835f666f3fe',
        '092cc6bb-2e10-496d-848e-3580d12fe3d6', null, true),

       ('5fa02445-d06a-48c5-ae9b-8febff917bcd', '636505be-e092-452e-8410-c6789cb4026f',
        '18eee600-30d1-436c-a213-2886668f81cd', 5, true),
       ('d179527f-66a6-451c-9c94-478247848f33', '8ee73399-3d62-4c16-9531-abd21553fde2',
        '18eee600-30d1-436c-a213-2886668f81cd', null, false),
       ('3d74c7f6-73f0-458a-8e9c-b9d96148eda4', '6aed2872-0756-40c8-8827-d835f666f3fe',
        '18eee600-30d1-436c-a213-2886668f81cd', 6, true),

       ('95ea486d-d5f0-47d0-adbd-d91249eec831', '636505be-e092-452e-8410-c6789cb4026f',
        '7c2938f7-43f2-462d-b59a-4d1ad34f7060', 12, true),
       ('81b8fb2c-ac0d-4d5a-8683-4c4c864ea143', '8ee73399-3d62-4c16-9531-abd21553fde2',
        '7c2938f7-43f2-462d-b59a-4d1ad34f7060', 9, true),
       ('8f26391f-2503-4f7f-9418-c835f2ab568b', '6aed2872-0756-40c8-8827-d835f666f3fe',
        '7c2938f7-43f2-462d-b59a-4d1ad34f7060', null, false);


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