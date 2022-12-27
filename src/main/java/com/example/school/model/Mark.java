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
public class Mark {
    @Builder.Default
    private UUID id = randomUUID();
    private Subject subject;
    private Student student;
    private int mark;
    private OffsetDateTime date;
    private boolean isPresent;
}
