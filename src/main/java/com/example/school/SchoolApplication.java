package com.example.school;

import com.example.school.model.Grade;
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
        Grade grade1A = new Grade("1A", "Olga Petrovna Semenova", new ArrayList<>());
        Grade grade1B = new Grade("1B", "Petr Vasilievich Gromov", new ArrayList<>());
        Grade grade2A = new Grade("2A", "Alina Andreevna Pusakova", new ArrayList<>());

        Student student1 = new Student("Igor", "Petrov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), grade1A);
        Student student2 = new Student("Oleg", "Ivanov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), grade1A);
        Student student3 = new Student("Maxim", "Svetlov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), grade1A);
        List<Student> students1A = new ArrayList<>();
        students1A.add(student1);
        students1A.add(student2);
        students1A.add(student3);

        Student student4 = new Student("Irina", "Kasanova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), grade1B);
        Student student5 = new Student("Svetlana ", "Limova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), grade1B);
        Student student6 = new Student("Maria", "Belova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), grade1B);
        List<Student> students1B = new ArrayList<>();
        students1B.add(student4);
        students1B.add(student5);
        students1B.add(student6);

        Student student7 = new Student("Elena", "Kolesova", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), grade2A);
        Student student8 = new Student("Olexandr", "Litvinov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), grade2A);
        Student student9 = new Student("Sophia", "Minina", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"), grade2A);
        List<Student> students2A = new ArrayList<>();
        students2A.add(student7);
        students2A.add(student8);
        students2A.add(student9);

        grade1A.setStudents(students1A);
        grade1B.setStudents(students1B);
        grade2A.setStudents(students2A);
    }
}
