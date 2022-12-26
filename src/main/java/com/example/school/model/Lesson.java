package com.example.school.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Lesson {
    private Subject subject;
    private Teacher teacher;
    private Group group;
    private String topic;
}
