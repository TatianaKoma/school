package com.example.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Group {
    private UUID id;
    private String name;
    private List<Student> students;
}
