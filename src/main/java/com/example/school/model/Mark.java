package com.example.school.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

import static java.util.UUID.randomUUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Mark {
    @Builder.Default
    private UUID id = randomUUID();
    private Lesson lesson;
    private Student student;
    private int value;
    private boolean isPresent;
}
