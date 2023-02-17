CREATE TABLE teachers
(
    id         UUID DEFAULT gen_random_uuid(),
    name       TEXT                     NOT NULL,
    surname    TEXT                     NOT NULL,
    start_date TIMESTAMP WITH TIME ZONE NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE groups
(
    id         UUID DEFAULT gen_random_uuid(),
    name       TEXT NOT NULL,
    teacher_id UUID NOT NULL,
    CONSTRAINT fk_teacher FOREIGN KEY (teacher_id) REFERENCES teachers (id),
    PRIMARY KEY (id)
);

CREATE TABLE subjects
(
    id   UUID DEFAULT gen_random_uuid(),
    name TEXT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE students
(
    id         UUID DEFAULT gen_random_uuid(),
    name       TEXT                     NOT NULL,
    surname    TEXT                     NOT NULL,
    start_date TIMESTAMP WITH TIME ZONE NOT NULL,
    group_id   UUID                     NOT NULL,
    CONSTRAINT fk_group FOREIGN KEY (group_id) REFERENCES groups (id),
    PRIMARY KEY (id)
);

CREATE TABLE lessons
(
    id         UUID DEFAULT gen_random_uuid(),
    subject_id UUID                     NOT NULL,
    teacher_id UUID                     NOT NULL,
    group_id   UUID                     NOT NULL,
    topic      TEXT                     NOT NULL,
    start_date TIMESTAMP WITH TIME ZONE NOT NULL,
    CONSTRAINT fk_subject FOREIGN KEY (subject_id) REFERENCES subjects (id),
    CONSTRAINT fk_teacher FOREIGN KEY (teacher_id) REFERENCES teachers (id),
    CONSTRAINT fk_group FOREIGN KEY (group_id) REFERENCES groups (id),
    PRIMARY KEY (id)
);

CREATE TABLE activities
(
    id         UUID DEFAULT gen_random_uuid(),
    lesson_id  UUID    NOT NULL,
    student_id UUID    NOT NULL,
    mark       INT,
    is_present BOOLEAN NOT NULL,
    CONSTRAINT fk_lesson FOREIGN KEY (lesson_id) REFERENCES lessons (id),
    CONSTRAINT fk_student FOREIGN KEY (student_id) REFERENCES students (id),
    PRIMARY KEY (id)
);