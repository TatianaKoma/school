package com.example.school;

import com.example.school.model.Group;
import com.example.school.model.Lesson;
import com.example.school.model.Activity;
import com.example.school.model.Student;
import com.example.school.model.Subject;
import com.example.school.model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import static java.time.OffsetDateTime.parse;
import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

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
                .id(UUID.fromString("a6ae5189-f528-4bed-837a-c4d56cf9b6bb"))
                .name("Igor")
                .surname("Petrov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var student2 = Student.builder()
                .id(UUID.fromString("085fc066-113c-4065-93cc-d3ab16bcf4e7"))
                .name("Oleg")
                .surname("Ivanov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var student3 = Student.builder()
                .id(UUID.fromString("b59cbbb6-ab12-441b-8f1f-e7dcdffd2010"))
                .name("Maxim")
                .surname("Svetlov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var student4 = Student.builder()
                .id(UUID.fromString("0e16ddd0-a9f3-4f5e-901b-824808cd4aa3"))
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

        var lesson1Student1Mark12 = Activity.builder()
                .lesson(lesson1)
                .student(student1)
                .mark(Optional.of(12))
                .isPresent(true)
                .build();
        var lesson2Student1Mark12 = Activity.builder()
                .lesson(lesson2)
                .student(student1)
                .mark(Optional.of(12))
                .isPresent(true)
                .build();
        var lesson3Student1Mark12 = Activity.builder()
                .lesson(lesson3)
                .student(student1)
                .mark(Optional.of(12))
                .isPresent(true)
                .build();

        var lesson1Student2Mark10 = Activity.builder()
                .lesson(lesson1)
                .student(student2)
                .mark(Optional.of(10))
                .isPresent(true)
                .build();
        var lesson2Student2Mark10 = Activity.builder()
                .lesson(lesson2)
                .student(student2)
                .mark(Optional.of(10))
                .isPresent(true)
                .build();
        var lesson3Student2Mark10 = Activity.builder()
                .lesson(lesson3)
                .student(student2)
                .mark(Optional.of(10))
                .isPresent(true)
                .build();

        var lesson1Student3Mark12 = Activity.builder()
                .lesson(lesson1)
                .student(student3)
                .mark(Optional.of(12))
                .isPresent(true)
                .build();
        var lesson2Student3NoMark = Activity.builder()
                .lesson(lesson2)
                .student(student3)
                .mark(Optional.empty())
                .isPresent(false)
                .build();
        var lesson3Student3NoMark = Activity.builder()
                .lesson(lesson3)
                .student(student3)
                .mark(Optional.empty())
                .isPresent(false)
                .build();

        var lesson1Student4NoMark = Activity.builder()
                .lesson(lesson1)
                .student(student4)
                .mark(Optional.empty())
                .isPresent(false)
                .build();
        var lesson2Student4NoMark = Activity.builder()
                .lesson(lesson2)
                .student(student4)
                .mark(Optional.empty())
                .isPresent(false)
                .build();
        var lesson3Student4NoMark = Activity.builder()
                .lesson(lesson3)
                .student(student4)
                .mark(Optional.empty())
                .isPresent(false)
                .build();

        var activities = List.of(
                lesson1Student1Mark12, lesson2Student1Mark12, lesson3Student1Mark12,
                lesson1Student2Mark10, lesson2Student2Mark10, lesson3Student2Mark10,
                lesson1Student3Mark12, lesson2Student3NoMark, lesson3Student3NoMark,
                lesson1Student4NoMark, lesson2Student4NoMark, lesson3Student4NoMark
        );
        System.out.println(findBestTruantsInSchool(activities));
        System.out.println(findBestTruantsInGroup(activities, group1A.getId()));
        System.out.println(find3BestStudentsInSchool(activities));
        System.out.println(find3BestStudentsInSchoolStream(activities));
        System.out.println(find3BestStudentsInGroupStream(activities,group1A.getId()));
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
        var activitiesForGroup = findActivitiesForSpecificGroup(activities, groupId);
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

    // method that gets a list of 3 students from school who have higher average marks
    private static List<UUID> find3BestStudentsInSchool(List<Activity> activities) {
        Map<UUID, List<Integer>> studentMarks = new HashMap<>();
        for (Activity activity : activities) {
            var studentId = activity.getStudent().getId();
            var studentMark = activity.getMark().orElse(0);
            var existingStudentMarks = Optional.ofNullable(studentMarks.get(studentId)).orElse(new ArrayList<>());
            existingStudentMarks.add(studentMark);
            studentMarks.put(studentId, existingStudentMarks);
        }
        System.out.println(studentMarks);

        Map<UUID, Double> studentsWithAverageMark = new HashMap<>();
        for (Map.Entry<UUID, List<Integer>> entry : studentMarks.entrySet()) {
            studentsWithAverageMark.put(entry.getKey(), getAverageMark(entry.getValue()));
        }
        return studentsWithAverageMark.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();
    }

    private static double getAverageMark(List<Integer> marks) {
        return marks.stream()
                .mapToInt(Integer::intValue)
                .average().orElseThrow();
    }

    // method that gets a list of 3 students from school who have higher average marks from school, using stream
    private static List<UUID> find3BestStudentsInSchoolStream(List<Activity> activities) {
        Map<UUID, Double> studentAverageMark = activities.stream()
                .collect(groupingBy((e -> e.getStudent().getId()), averagingDouble(e -> e.getMark().orElse(0))));

        return studentAverageMark.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();
    }

    // method that gets a list of 3 students from school who have higher average marks from group, using stream
    private static List<UUID> find3BestStudentsInGroupStream(List<Activity> activities, UUID groupId) {
        var activitiesForGroup = findActivitiesForSpecificGroup(activities, groupId);
        return find3BestStudentsInSchoolStream(activitiesForGroup);
    }

    private static List<Activity> findActivitiesForSpecificGroup(List<Activity> activities, UUID groupId) {
        return activities.stream()
                .filter(e -> e.getStudent().getGroup().getId().equals(groupId))
                .toList();
    }
}
