package com.example.school;

import com.example.school.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.OffsetDateTime;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);
        Student student1 = new Student("Igor", "Petrov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"));
        Student student2 = new Student("Oleg", "Ivanov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"));
        Student student3 = new Student("Maxim", "Svetlov", OffsetDateTime.parse("2022-09-01T09:00:00+01:00"));
    }
}
