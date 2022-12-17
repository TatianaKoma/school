package com.example.school;

import com.example.school.model.Group;
import com.example.school.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.OffsetDateTime;
import java.util.ArrayList;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);

        var group1A = new Group(UUID.randomUUID(), "1A", new ArrayList<>());
        var group1B = new Group(UUID.randomUUID(), "1B", new ArrayList<>());
        var group2A = new Group(UUID.randomUUID(), "2A", new ArrayList<>());

        var student1 = new Student(UUID.randomUUID(), "Igor", "Petrov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1A);
        var student2 = new Student(UUID.randomUUID(), "Oleg", "Ivanov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1A);
        var student3 = new Student(UUID.randomUUID(), "Maxim", "Svetlov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1A);
        List<Student> students1A = new ArrayList<>();
        students1A.add(student1);
        students1A.add(student2);
        students1A.add(student3);

        var student4 = new Student(UUID.randomUUID(), "Irina", "Kasanova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1B);
        var student5 = new Student(UUID.randomUUID(), "Svetlana ", "Limova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1B);
        var student6 = new Student(UUID.randomUUID(), "Maria", "Belova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1B);
        List<Student> students1B = new ArrayList<>();
        students1B.add(student4);
        students1B.add(student5);
        students1B.add(student6);

        var student7 = new Student(UUID.randomUUID(), "Elena", "Kolesova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group2A);
        var student8 = new Student(UUID.randomUUID(), "Olexandr", "Litvinov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group2A);
        var student9 = new Student(UUID.randomUUID(), "Sophia", "Minina", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group2A);
        List<Student> students2A = new ArrayList<>();
        students2A.add(student7);
        students2A.add(student8);
        students2A.add(student9);

        group1A.setStudents(students1A);
        group1B.setStudents(students1B);
        group2A.setStudents(students2A);
    }
}
