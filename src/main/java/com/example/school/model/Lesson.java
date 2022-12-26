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
public class Lesson {
    @Builder.Default
    private UUID id = randomUUID();
    private Subject subject;
    private Teacher teacher;
    private Group group;
    private String topic;
}
