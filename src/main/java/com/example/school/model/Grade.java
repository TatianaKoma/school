package com.example.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Grade {
    private String name;
    private String headTeacherName;
    private List<Student> students;
}
