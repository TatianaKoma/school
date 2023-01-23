package com.example.school;

import com.example.school.model.Group;
import com.example.school.model.Lesson;
import com.example.school.model.Activity;
import com.example.school.model.Student;
import com.example.school.model.Subject;
import com.example.school.model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import static java.time.OffsetDateTime.parse;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);
        var maths = Subject.builder()
                .name("maths")
                .build();
        var reading = Subject.builder()
                .name("reading")
                .build();
        var writing = Subject.builder()
                .name("writing")
                .build();
        var english = Subject.builder()
                .name("english")
                .build();

        var teacher1 = Teacher.builder()
                .name("Irina")
                .surname("Koroseva")
                .startDate(parse("2000-09-01T09:00:00+01:00"))
                .build();
        var teacher2 = Teacher.builder()
                .name("Lev")
                .surname("Fridman")
                .startDate(parse("2019-09-01T09:00:00+01:00"))
                .build();
        var teacher3 = Teacher.builder()
                .name("Tamara")
                .surname("Mishina")
                .startDate(parse("2016-09-01T09:00:00+01:00"))
                .build();

        var group1A = Group.builder()
                .name("1A")
                .lead(teacher1)
                .build();
        var group1B = Group.builder()
                .name("1B")
                .lead(teacher2)
                .build();
        var group2A = Group.builder()
                .name("2A")
                .lead(teacher3)
                .build();

        var student1 = Student.builder()
                .name("Igor")
                .surname("Petrov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var student2 = Student.builder()
                .name("Oleg")
                .surname("Ivanov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var student3 = Student.builder()
                .name("Maxim")
                .surname("Svetlov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var student4 = Student.builder()
                .name("Irina")
                .surname("Kasanova")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1B)
                .build();
        var student5 = Student.builder()
                .name("Svetlana")
                .surname("Limova")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1B)
                .build();
        var student6 = Student.builder()
                .name("Maria")
                .surname("Belova")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1B)
                .build();
        var student7 = Student.builder()
                .name("Elena")
                .surname("Kolesova")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group2A)
                .build();
        var student8 = Student.builder()
                .name("Olexandr")
                .surname("Litvinov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group2A)
                .build();
        var student9 = Student.builder()
                .name("Sophia")
                .surname("Minina")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group2A)
                .build();

        var lesson1 = Lesson.builder()
                .subject(maths)
                .teacher(teacher1)
                .group(group1A)
                .topic("Addition")
                .startDate(parse("2022-09-21T11:00:00+01:00"))
                .build();
        var lesson2 = Lesson.builder()
                .subject(writing)
                .teacher(teacher3)
                .group(group1B)
                .topic("Alphabet")
                .startDate(parse("2022-09-21T11:00:00+01:00"))
                .build();
        var lesson3 = Lesson.builder()
                .subject(english)
                .teacher(teacher2)
                .group(group2A)
                .topic("Articles")
                .startDate(parse("2022-09-17T12:30:00+01:00"))
                .build();

        var students1A = List.of(student1, student2, student3);
        var students1B = List.of(student4, student5, student6);
        var students2A = List.of(student7, student8, student9);

        group1A.setStudents(students1A);
        group1B.setStudents(students1B);
        group2A.setStudents(students2A);
        var activity1 = Activity.builder()
                .lesson(lesson1)
                .student(student1)
                .mark(Optional.of(12))
                .isPresent(true)
                .build();
        var activity2 = Activity.builder()
                .lesson(lesson2)
                .student(student2)
                .mark(Optional.of(10))
                .isPresent(true)
                .build();
        var activity3 = Activity.builder()
                .lesson(lesson3)
                .student(student7)
                .mark(Optional.empty())
                .isPresent(false)
                .build();
        var activity4 = Activity.builder()
                .lesson(lesson1)
                .student(student2)
                .mark(Optional.empty())
                .isPresent(false)
                .build();
        var activity5 = Activity.builder()
                .lesson(lesson3)
                .student(student2)
                .mark(Optional.empty())
                .isPresent(false)
                .build();
        var activity6 = Activity.builder()
                .lesson(lesson3)
                .student(student6)
                .mark(Optional.of(9))
                .isPresent(true)
                .build();
        var activity7 = Activity.builder()
                .lesson(lesson3)
                .student(student7)
                .mark(Optional.of(5))
                .isPresent(true)
                .build();
        var activity8 = Activity.builder()
                .lesson(lesson1)
                .student(student7)
                .mark(Optional.empty())
                .isPresent(false)
                .build();
        var activities = List.of(activity1, activity2, activity3, activity4, activity5);
        var activities1 = List.of(activity1, activity2, activity3, activity4, activity5, activity6, activity7, activity8);
        System.out.println(findBestTruantsInSchool(activities));
        System.out.println(findBestTruantsInGroup(activities1, group2A.getId()));
    }

    // method that gets a list of students from the school who skipped the most lessons
    private static List<Student> findBestTruantsInSchool(List<Activity> activities) {
        var amountSkippedLessonsForEachStudentFromSchool = countSkippedLessonsForEachStudent(activities);
        int maxAmountOfTruancies = amountSkippedLessonsForEachStudentFromSchool.values().stream()
                .max(Integer::compareTo)
                .orElse(-1);
        return amountSkippedLessonsForEachStudentFromSchool.entrySet().stream()
                .filter(e -> e.getValue() == maxAmountOfTruancies)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // method that gets a list of students from the group who skipped the most lessons
    private static List<Student> findBestTruantsInGroup(List<Activity> activities, UUID groupId) {
        var activitiesForGroup = activities.stream()
                .filter(e -> e.getStudent().getGroup().getId().equals(groupId))
                .toList();
        return findBestTruantsInSchool(activitiesForGroup);
    }

    private static Map<Student, Integer> countSkippedLessonsForEachStudent(List<Activity> activities) {
        Map<Student, Integer> amountTruanciesEachStudent = new HashMap<>();
        for (var activity : activities) {
            if (!activity.isPresent()) {
                var student = activity.getStudent();
                var skippedLesson = 1;
                if (amountTruanciesEachStudent.containsKey(student)) {
                    skippedLesson = amountTruanciesEachStudent.get(student) + 1;
                }
                amountTruanciesEachStudent.put(student, skippedLesson);
            }
        }
        return amountTruanciesEachStudent;
    }
}
