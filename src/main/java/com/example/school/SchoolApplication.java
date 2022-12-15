package com.example.school;

import com.example.school.model.Group;
import com.example.school.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);

        Group group1A = new Group(UUIDGenerator.generateType4UUID(), "1A", new ArrayList<>());
        Group group1B = new Group(UUIDGenerator.generateType4UUID(), "1B", new ArrayList<>());
        Group group2A = new Group(UUIDGenerator.generateType4UUID(), "2A", new ArrayList<>());

        Student student1 = new Student(UUIDGenerator.generateType4UUID(), "Igor", "Petrov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1A);
        Student student2 = new Student(UUIDGenerator.generateType4UUID(), "Oleg", "Ivanov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1A);
        Student student3 = new Student(UUIDGenerator.generateType4UUID(), "Maxim", "Svetlov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1A);
        List<Student> students1A = new ArrayList<>();
        students1A.add(student1);
        students1A.add(student2);
        students1A.add(student3);

        Student student4 = new Student(UUIDGenerator.generateType4UUID(), "Irina", "Kasanova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1B);
        Student student5 = new Student(UUIDGenerator.generateType4UUID(), "Svetlana ", "Limova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1B);
        Student student6 = new Student(UUIDGenerator.generateType4UUID(), "Maria", "Belova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1B);
        List<Student> students1B = new ArrayList<>();
        students1B.add(student4);
        students1B.add(student5);
        students1B.add(student6);

        Student student7 = new Student(UUIDGenerator.generateType4UUID(), "Elena", "Kolesova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group2A);
        Student student8 = new Student(UUIDGenerator.generateType4UUID(), "Olexandr", "Litvinov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group2A);
        Student student9 = new Student(UUIDGenerator.generateType4UUID(), "Sophia", "Minina", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group2A);
        List<Student> students2A = new ArrayList<>();
        students2A.add(student7);
        students2A.add(student8);
        students2A.add(student9);

        group1A.setStudents(students1A);
        group1B.setStudents(students1B);
        group2A.setStudents(students2A);
    }
}
