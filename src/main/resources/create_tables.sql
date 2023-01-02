CREATE TABLE teacher
(
    id        UUID PRIMARY KEY         NOT NULL,
    name      VARCHAR(50)              NOT NULL,
    surname   VARCHAR(50)              NOT NULL,
    startDate TIMESTAMP WITH TIME ZONE NOT NULL
);

CREATE TABLE "group"
(
    id      UUID PRIMARY KEY NOT NULL,
    name    VARCHAR(50)      NOT NULL,
    teacher teacher          NOT NULL
);

CREATE TABLE subject
(
    id   UUID PRIMARY KEY NOT NULL,
    name VARCHAR(50)      NOT NULL
);

CREATE TABLE student
(
    id        UUID PRIMARY KEY         NOT NULL,
    name      VARCHAR(50)              NOT NULL,
    surname   VARCHAR(50)              NOT NULL,
    startDate TIMESTAMP WITH TIME ZONE NOT NULL,
    "group"   "group"                  NOT NULL
);

CREATE TABLE lesson
(
    id        UUID PRIMARY KEY         NOT NULL,
    subject   subject                  NOT NULL,
    teacher   teacher                  NOT NULL,
    "group"   "group"                  NOT NULL,
    topic     VARCHAR(50)              NOT NULL,
    startDate TIMESTAMP WITH TIME ZONE NOT NULL
);

CREATE TABLE activity
(
    id       UUID PRIMARY KEY NOT NULL,
    lesson   lesson           NOT NULL,
    student  student          NOT NULL,
    mark     INT,
    isPresent boolean          NOT NULL
);