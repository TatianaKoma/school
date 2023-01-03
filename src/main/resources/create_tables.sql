CREATE TABLE teachers
(
    id        UUID PRIMARY KEY         NOT NULL,
    name      TEXT                     NOT NULL,
    surname   TEXT                     NOT NULL,
    startDate TIMESTAMP WITH TIME ZONE NOT NULL
);

CREATE TABLE "groups"
(
    id      UUID PRIMARY KEY NOT NULL,
    name    TEXT             NOT NULL,
    teacher teachers         NOT NULL
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
    startDate TIMESTAMP WITH TIME ZONE NOT NULL,
    "group"   "groups"                 NOT NULL
);

CREATE TABLE lessons
(
    id        UUID PRIMARY KEY         NOT NULL,
    subject   subjects                 NOT NULL,
    teacher   teachers                 NOT NULL,
    "group"   "groups"                 NOT NULL,
    topic     TEXT                     NOT NULL,
    startDate TIMESTAMP WITH TIME ZONE NOT NULL
);

CREATE TABLE activities
(
    id        UUID PRIMARY KEY NOT NULL,
    lesson    lessons          NOT NULL,
    student   students         NOT NULL,
    mark      INT,
    isPresent boolean          NOT NULL
);