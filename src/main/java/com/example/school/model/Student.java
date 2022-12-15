package com.example.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private String name;
    private String surname;
    private OffsetDateTime startStudying;
}
