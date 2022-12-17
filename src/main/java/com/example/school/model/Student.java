package com.example.school.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Student {
    private UUID id;
    private String name;
    private String surname;
    private OffsetDateTime startDate;
    private Group group;
}
