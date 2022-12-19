package com.example.school;

import com.example.school.model.Group;
import com.example.school.model.Student;
import com.example.school.model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import static java.time.OffsetDateTime.parse;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);
        var teacher1 = Teacher.builder()
                .name("Irina Petrovna")
                .surname("Koroseva")
                .build();
        var teacher2 = Teacher.builder()
                .name("Lev Petrovich")
                .surname("Fridman")
                .build();
        var teacher3 = Teacher.builder()
                .name("Tamara Artemovna")
                .surname("Mishina")
                .build();

        var group1A = Group.builder()
                .name("1A")
                .headTeacher(teacher1)
                .build();
        var group1B = Group.builder()
                .name("1B")
                .headTeacher(teacher2)
                .build();
        var group2A = Group.builder()
                .name("2A")
                .headTeacher(teacher3)
                .build();

        var student1 = Student.builder()
                .name("Igor")
                .surname("Petrov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var student2 = Student.builder()
                .name("Oleg")
                .surname("Ivanov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var student3 = Student.builder()
                .name("Maxim")
                .surname("Svetlov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var student4 = Student.builder()
                .name("Irina")
                .surname("Kasanova")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1B)
                .build();
        var student5 = Student.builder()
                .name("Svetlana")
                .surname("Limova")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1B)
                .build();
        var student6 = Student.builder()
                .name("Maria")
                .surname("Belova")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1B)
                .build();
        var student7 = Student.builder()
                .name("Elena")
                .surname("Kolesova")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group2A)
                .build();
        var student8 = Student.builder()
                .name("Olexandr")
                .surname("Litvinov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group2A)
                .build();
        var student9 = Student.builder()
                .name("Sophia")
                .surname("Minina")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group2A)
                .build();

        var students1A = List.of(student1, student2, student3);
        var students1B = List.of(student4, student5, student6);
        var students2A = List.of(student7, student8, student9);
        group1A.setStudents(students1A);
        group1B.setStudents(students1B);
        group2A.setStudents(students2A);
    }
}
