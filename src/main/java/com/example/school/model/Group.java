package com.example.school.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.util.UUID.randomUUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Group {
    @Builder.Default
    private UUID id = randomUUID();
    private String name;
    @Builder.Default
    private List<Student> students = new ArrayList<>();
}
