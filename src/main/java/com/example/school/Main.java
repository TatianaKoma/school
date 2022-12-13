package com.example.school;

import com.example.school.model.Student;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Igor", "Petrov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"));
        Student student2 = new Student("Oleg", "Ivanov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"));
        Student student3 = new Student("Maxim", "Svetlov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"));
    }
}
