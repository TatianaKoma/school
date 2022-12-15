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
        UUID uniqueID = UUID.randomUUID();
        Group group1A = new Group(uniqueID,"1A", new ArrayList<>());
        Group group1B = new Group(uniqueID,"1B", new ArrayList<>());
        Group group2A = new Group(uniqueID,"2A", new ArrayList<>());

        Student student1 = new Student(uniqueID,"Igor", "Petrov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1A);
        Student student2 = new Student(uniqueID,"Oleg", "Ivanov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1A);
        Student student3 = new Student(uniqueID,"Maxim", "Svetlov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1A);
        List<Student> students1A = new ArrayList<>();
        students1A.add(student1);
        students1A.add(student2);
        students1A.add(student3);

        Student student4 = new Student(uniqueID,"Irina", "Kasanova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1B);
        Student student5 = new Student(uniqueID,"Svetlana ", "Limova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1B);
        Student student6 = new Student(uniqueID,"Maria", "Belova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group1B);
        List<Student> students1B = new ArrayList<>();
        students1B.add(student4);
        students1B.add(student5);
        students1B.add(student6);

        Student student7 = new Student(uniqueID,"Elena", "Kolesova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group2A);
        Student student8 = new Student(uniqueID,"Olexandr", "Litvinov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group2A);
        Student student9 = new Student(uniqueID,"Sophia", "Minina", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), group2A);
        List<Student> students2A = new ArrayList<>();
        students2A.add(student7);
        students2A.add(student8);
        students2A.add(student9);

        group1A.setStudents(students1A);
        group1B.setStudents(students1B);
        group2A.setStudents(students2A);
    }
}
