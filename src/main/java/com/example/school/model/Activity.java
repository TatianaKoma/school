package com.example.school.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;
import java.util.UUID;

import static java.util.UUID.randomUUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Activity {
    @Builder.Default
    private UUID id = randomUUID();
    private Lesson lesson;
    private Student student;
    private Optional<Integer> mark;
    private boolean isPresent;
}
