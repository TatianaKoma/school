package com.example.school;

import com.example.school.model.Group;
import com.example.school.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.OffsetDateTime;
import java.util.ArrayList;

import static java.util.UUID.randomUUID;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);

        var group1A = Group.builder()
                .id(randomUUID())
                .name("1A")
                .students(new ArrayList<>())
                .build();
        var group1B = Group.builder()
                .id(randomUUID())
                .name("1B")
                .students(new ArrayList<>())
                .build();
        var group2A = Group.builder()
                .id(randomUUID())
                .name("2A")
                .students(new ArrayList<>())
                .build();
        var student1 = Student.builder()
                .id(randomUUID())
                .name("Igor")
                .surname("Petrov")
                .startDate(OffsetDateTime.parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var student2 = Student.builder()
                .id(randomUUID())
                .name("Oleg")
                .surname("Ivanov")
                .startDate(OffsetDateTime.parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var student3 = Student.builder()
                .id(randomUUID())
                .name("Maxim")
                .surname("Svetlov")
                .startDate(OffsetDateTime.parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var students1A = new ArrayList<Student>();
        students1A.add(student1);
        students1A.add(student2);
        students1A.add(student3);

        var student4 = Student.builder()
                .id(randomUUID())
                .name("Irina")
                .surname("Kasanova")
                .startDate(OffsetDateTime.parse("2022-09-01T09:00:00+01:00"))
                .group(group1B)
                .build();
        var student5 = Student.builder()
                .id(randomUUID())
                .name("Svetlana")
                .surname("Limova")
                .startDate(OffsetDateTime.parse("2022-09-01T09:00:00+01:00"))
                .group(group1B)
                .build();
        var student6 = Student.builder()
                .id(randomUUID())
                .name("Maria")
                .surname("Belova")
                .startDate(OffsetDateTime.parse("2022-09-01T09:00:00+01:00"))
                .group(group1B)
                .build();
        var students1B = new ArrayList<Student>();
        students1B.add(student4);
        students1B.add(student5);
        students1B.add(student6);

        var student7 = Student.builder()
                .id(randomUUID())
                .name("Elena")
                .surname("Kolesova")
                .startDate(OffsetDateTime.parse("2022-09-01T09:00:00+01:00"))
                .group(group2A)
                .build();
        var student8 = Student.builder()
                .id(randomUUID())
                .name("Olexandr")
                .surname("Litvinov")
                .startDate(OffsetDateTime.parse("2022-09-01T09:00:00+01:00"))
                .group(group2A)
                .build();
        var student9 = Student.builder()
                .id(randomUUID())
                .name("Sophia")
                .surname("Minina")
                .startDate(OffsetDateTime.parse("2022-09-01T09:00:00+01:00"))
                .group(group2A)
                .build();
        var students2A = new ArrayList<Student>();
        students2A.add(student7);
        students2A.add(student8);
        students2A.add(student9);

        group1A.setStudents(students1A);
        group1B.setStudents(students1B);
        group2A.setStudents(students2A);
    }
}
