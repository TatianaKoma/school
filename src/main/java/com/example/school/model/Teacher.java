package com.example.school.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

import static java.util.UUID.randomUUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Teacher {
    @Builder.Default
    private UUID id = randomUUID();
    private String name;
    private String surname;
    private OffsetDateTime startDate;
}
