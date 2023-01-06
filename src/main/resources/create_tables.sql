CREATE TABLE teachers
(
    id        UUID PRIMARY KEY         NOT NULL,
    name      TEXT                     NOT NULL,
    surname   TEXT                     NOT NULL,
    start_date TIMESTAMP WITH TIME ZONE NOT NULL
);

CREATE TABLE groups
(
    id         UUID PRIMARY KEY NOT NULL,
    name       TEXT             NOT NULL,
    teacher_id UUID             NOT NULL,
    CONSTRAINT fk_teacher FOREIGN KEY (teacher_id) REFERENCES teachers (id)
);

CREATE TABLE subjects
(
    id   UUID PRIMARY KEY NOT NULL,
    name TEXT             NOT NULL
);

CREATE TABLE students
(
    id        UUID PRIMARY KEY         NOT NULL,
    name      TEXT                     NOT NULL,
    surname   TEXT                     NOT NULL,
    start_date TIMESTAMP WITH TIME ZONE NOT NULL,
    group_id  UUID                     NOT NULL,
    CONSTRAINT fk_group FOREIGN KEY (group_id) REFERENCES groups (id)
);

CREATE TABLE lessons
(
    id         UUID PRIMARY KEY         NOT NULL,
    subject_id UUID                     NOT NULL,
    teacher_id UUID                     NOT NULL,
    group_id   UUID                     NOT NULL,
    topic      TEXT                     NOT NULL,
    start_date  TIMESTAMP WITH TIME ZONE NOT NULL,
    CONSTRAINT fk_subject FOREIGN KEY (subject_id) REFERENCES subjects (id),
    CONSTRAINT fk_teacher FOREIGN KEY (teacher_id) REFERENCES teachers (id),
    CONSTRAINT fk_group FOREIGN KEY (group_id) REFERENCES groups (id)
);

CREATE TABLE activities
(
    id         UUID PRIMARY KEY NOT NULL,
    lesson_id  UUID             NOT NULL,
    student_id UUID             NOT NULL,
    mark       INT,
    is_present  BOOLEAN         NOT NULL,
    CONSTRAINT fk_lesson FOREIGN KEY (lesson_id) REFERENCES lessons (id),
    CONSTRAINT fk_student FOREIGN KEY (student_id) REFERENCES students (id)
);