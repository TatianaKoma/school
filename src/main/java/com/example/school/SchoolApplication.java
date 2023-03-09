package com.example.school;

import com.example.school.model.Group;
import com.example.school.model.Lesson;
import com.example.school.model.Activity;
import com.example.school.model.Student;
import com.example.school.model.Subject;
import com.example.school.model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
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

        var teacherIrinaKoroseva = Teacher.builder()
                .name("Irina")
                .surname("Koroseva")
                .startDate(parse("2000-09-01T09:00:00+01:00"))
                .build();
        var teacherLevFridman = Teacher.builder()
                .name("Lev")
                .surname("Fridman")
                .startDate(parse("2019-09-01T09:00:00+01:00"))
                .build();
        var teacherTamaraMishina = Teacher.builder()
                .name("Tamara")
                .surname("Mishina")
                .startDate(parse("2016-09-01T09:00:00+01:00"))
                .build();

        var group1A = Group.builder()
                .name("1A")
                .lead(teacherIrinaKoroseva)
                .build();
        var group1B = Group.builder()
                .name("1B")
                .lead(teacherTamaraMishina)
                .build();
        var group2A = Group.builder()
                .name("2A")
                .lead(teacherLevFridman)
                .build();

        var studentIgorPetrov1A = Student.builder()
                .id(UUID.fromString("a6ae5189-f528-4bed-837a-c4d56cf9b6bb"))
                .name("Igor")
                .surname("Petrov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var studentOlegIvanov1A = Student.builder()
                .id(UUID.fromString("085fc066-113c-4065-93cc-d3ab16bcf4e7"))
                .name("Oleg")
                .surname("Ivanov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();
        var studentMaximSvetlov1A = Student.builder()
                .id(UUID.fromString("b59cbbb6-ab12-441b-8f1f-e7dcdffd2010"))
                .name("Maxim")
                .surname("Svetlov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1A)
                .build();

        var studentIrinaKasanova1B = Student.builder()
                .id(UUID.fromString("0e16ddd0-a9f3-4f5e-901b-824808cd4aa3"))
                .name("Irina")
                .surname("Kasanova")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1B)
                .build();
        var studentSvetlanaLimova1B = Student.builder()
                .id(UUID.fromString("bae0921b-f143-4ce8-ac0d-6b56b68de7da"))
                .name("Svetlana")
                .surname("Limova")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1B)
                .build();
        var studentMariaBelova1B = Student.builder()
                .id(UUID.fromString("d98cd650-c82f-4db4-a81d-b1c50a16fbce"))
                .name("Maria")
                .surname("Belova")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group1B)
                .build();

        var studentElenaKolesova2A = Student.builder()
                .id(UUID.fromString("092cc6bb-2e10-496d-848e-3580d12fe3d6"))
                .name("Elena")
                .surname("Kolesova")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group2A)
                .build();
        var studentOlexandrLitvinov2A = Student.builder()
                .id(UUID.fromString("18eee600-30d1-436c-a213-2886668f81cd"))
                .name("Olexandr")
                .surname("Litvinov")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group2A)
                .build();
        var studentSophiaMinina2A = Student.builder()
                .id(UUID.fromString("7c2938f7-43f2-462d-b59a-4d1ad34f7060"))
                .name("Sophia")
                .surname("Minina")
                .startDate(parse("2022-09-01T09:00:00+01:00"))
                .group(group2A)
                .build();

        var mathLessonFor1A = Lesson.builder()
                .subject(maths)
                .teacher(teacherIrinaKoroseva)
                .group(group1A)
                .topic("Addition")
                .startDate(parse("2022-09-21T09:00:00+01:00"))
                .build();
        var math2LessonFor1A = Lesson.builder()
                .subject(maths)
                .teacher(teacherIrinaKoroseva)
                .group(group1A)
                .topic("Subtraction")
                .startDate(parse("2022-09-23T09:00:00+01:00"))
                .build();
        var math3LessonFor1A = Lesson.builder()
                .subject(maths)
                .teacher(teacherIrinaKoroseva)
                .group(group1A)
                .topic("Division")
                .startDate(parse("2022-09-24T09:00:00+01:00"))
                .build();
        var writingLessonFor1A = Lesson.builder()
                .subject(writing)
                .teacher(teacherIrinaKoroseva)
                .group(group1A)
                .topic("Alphabet")
                .startDate(parse("2022-09-21T10:00:00+01:00"))
                .build();
        var englishLessonFor1A = Lesson.builder()
                .subject(english)
                .teacher(teacherLevFridman)
                .group(group1A)
                .topic("Articles")
                .startDate(parse("2022-09-21T11:00:00+01:00"))
                .build();

        var mathLessonFor1B = Lesson.builder()
                .subject(maths)
                .teacher(teacherTamaraMishina)
                .group(group1B)
                .topic("Addition")
                .startDate(parse("2022-09-21T09:00:00+01:00"))
                .build();
        var writingLessonFor1B = Lesson.builder()
                .subject(writing)
                .teacher(teacherTamaraMishina)
                .group(group1B)
                .topic("Alphabet")
                .startDate(parse("2022-09-21T11:00:00+01:00"))
                .build();
        var englishLessonFor1B = Lesson.builder()
                .subject(english)
                .teacher(teacherLevFridman)
                .group(group1B)
                .topic("Articles")
                .startDate(parse("2022-09-21T10:00:00+01:00"))
                .build();

        var mathLessonFor2A = Lesson.builder()
                .subject(maths)
                .teacher(teacherTamaraMishina)
                .group(group2A)
                .topic("Equations")
                .startDate(parse("2022-09-22T09:00:00+01:00"))
                .build();
        var readingLessonFor2A = Lesson.builder()
                .subject(reading)
                .teacher(teacherIrinaKoroseva)
                .group(group2A)
                .topic("Animal stories")
                .startDate(parse("2022-09-22T10:00:00+01:00"))
                .build();
        var writingLessonFor2A = Lesson.builder()
                .subject(writing)
                .teacher(teacherLevFridman)
                .group(group2A)
                .topic("Parts of speech")
                .startDate(parse("2022-09-22T11:00:00+01:00"))
                .build();

        var students1A = List.of(studentIgorPetrov1A, studentMaximSvetlov1A, studentOlegIvanov1A);
        var students1B = List.of(studentSvetlanaLimova1B, studentIrinaKasanova1B, studentMariaBelova1B);
        var students2A = List.of(studentElenaKolesova2A, studentOlexandrLitvinov2A, studentSophiaMinina2A);

        group1A.setStudents(students1A);
        group1B.setStudents(students1B);
        group2A.setStudents(students2A);

        var mathIgorPetrov1Mark12 = Activity.builder()
                .lesson(mathLessonFor1A)
                .student(studentIgorPetrov1A)
                .mark(Optional.of(12))
                .isPresent(true)
                .build();
        var math2IgorPetrov1Mark9 = Activity.builder()
                .lesson(math2LessonFor1A)
                .student(studentIgorPetrov1A)
                .mark(Optional.of(9))
                .isPresent(true)
                .build();
        var math3IgorPetrov1NoMark = Activity.builder()
                .lesson(math3LessonFor1A)
                .student(studentIgorPetrov1A)
                .mark(Optional.empty())
                .isPresent(true)
                .build();
        var writingIgorPetrovMark12 = Activity.builder()
                .lesson(writingLessonFor1A)
                .student(studentIgorPetrov1A)
                .mark(Optional.of(12))
                .isPresent(true)
                .build();
        var englishIgorPetrovMark12 = Activity.builder()
                .lesson(englishLessonFor1A)
                .student(studentIgorPetrov1A)
                .mark(Optional.of(12))
                .isPresent(true)
                .build();

        var mathOlegIvanovMark10 = Activity.builder()
                .lesson(mathLessonFor1A)
                .student(studentOlegIvanov1A)
                .mark(Optional.of(10))
                .isPresent(true)
                .build();
        var writingOlegIvanovMark10 = Activity.builder()
                .lesson(writingLessonFor1A)
                .student(studentOlegIvanov1A)
                .mark(Optional.of(10))
                .isPresent(true)
                .build();
        var englishOlegIvanovMark10 = Activity.builder()
                .lesson(englishLessonFor1A)
                .student(studentOlegIvanov1A)
                .mark(Optional.of(10))
                .isPresent(true)
                .build();

        var mathMaximSvetlovMark12 = Activity.builder()
                .lesson(mathLessonFor1A)
                .student(studentMaximSvetlov1A)
                .mark(Optional.of(12))
                .isPresent(true)
                .build();
        var writingMaximSvetlovNoMark = Activity.builder()
                .lesson(writingLessonFor1A)
                .student(studentMaximSvetlov1A)
                .mark(Optional.empty())
                .isPresent(false)
                .build();
        var englishMaximSvetlovNoMark = Activity.builder()
                .lesson(englishLessonFor1A)
                .student(studentMaximSvetlov1A)
                .mark(Optional.empty())
                .isPresent(false)
                .build();

        var mathIrinaKasanovaNoMark = Activity.builder()
                .lesson(mathLessonFor1B)
                .student(studentIrinaKasanova1B)
                .mark(Optional.empty())
                .isPresent(false)
                .build();
        var writingIrinaKasanovaNoMark = Activity.builder()
                .lesson(writingLessonFor1B)
                .student(studentIrinaKasanova1B)
                .mark(Optional.empty())
                .isPresent(false)
                .build();
        var englishIrinaKasanovaNoMark = Activity.builder()
                .lesson(englishLessonFor1B)
                .student(studentIrinaKasanova1B)
                .mark(Optional.empty())
                .isPresent(false)
                .build();

        var mathSvetlanaLimovaMark7 = Activity.builder()
                .lesson(mathLessonFor1B)
                .student(studentSvetlanaLimova1B)
                .mark(Optional.of(7))
                .isPresent(true)
                .build();
        var writingSvetlanaLimovaMark6 = Activity.builder()
                .lesson(writingLessonFor1B)
                .student(studentSvetlanaLimova1B)
                .mark(Optional.of(6))
                .isPresent(true)
                .build();
        var englishSvetlanaLimovaMark5 = Activity.builder()
                .lesson(englishLessonFor1B)
                .student(studentSvetlanaLimova1B)
                .mark(Optional.of(5))
                .isPresent(true)
                .build();

        var mathMariaBelovaMark10 = Activity.builder()
                .lesson(mathLessonFor1B)
                .student(studentMariaBelova1B)
                .mark(Optional.of(10))
                .isPresent(true)
                .build();
        var writingMariaBelovaMark9 = Activity.builder()
                .lesson(writingLessonFor1B)
                .student(studentMariaBelova1B)
                .mark(Optional.of(9))
                .isPresent(true)
                .build();
        var englishMariaBelovaMark5 = Activity.builder()
                .lesson(englishLessonFor1B)
                .student(studentMariaBelova1B)
                .mark(Optional.of(5))
                .isPresent(true)
                .build();

        var mathElenaKolesovaMark12 = Activity.builder()
                .lesson(mathLessonFor2A)
                .student(studentElenaKolesova2A)
                .mark(Optional.of(12))
                .isPresent(true)
                .build();
        var readingElenaKolesovaMark10 = Activity.builder()
                .lesson(readingLessonFor2A)
                .student(studentElenaKolesova2A)
                .mark(Optional.of(10))
                .isPresent(true)
                .build();
        var writingElenaKolesovaNoMark = Activity.builder()
                .lesson(writingLessonFor2A)
                .student(studentElenaKolesova2A)
                .mark(Optional.empty())
                .isPresent(true)
                .build();

        var mathOlexandrLitvinovMark5 = Activity.builder()
                .lesson(mathLessonFor2A)
                .student(studentOlexandrLitvinov2A)
                .mark(Optional.of(5))
                .isPresent(true)
                .build();
        var readingOlexandrLitvinovNoMark = Activity.builder()
                .lesson(readingLessonFor2A)
                .student(studentOlexandrLitvinov2A)
                .mark(Optional.empty())
                .isPresent(false)
                .build();
        var writingOlexandrLitvinovMark6 = Activity.builder()
                .lesson(writingLessonFor2A)
                .student(studentOlexandrLitvinov2A)
                .mark(Optional.of(6))
                .isPresent(true)
                .build();

        var mathSophiaMininaMark12 = Activity.builder()
                .lesson(mathLessonFor2A)
                .student(studentSophiaMinina2A)
                .mark(Optional.of(12))
                .isPresent(true)
                .build();
        var readingSophiaMininaMark9 = Activity.builder()
                .lesson(readingLessonFor2A)
                .student(studentSophiaMinina2A)
                .mark(Optional.of(9))
                .isPresent(true)
                .build();
        var writingSophiaMininaNoMark = Activity.builder()
                .lesson(writingLessonFor2A)
                .student(studentSophiaMinina2A)
                .mark(Optional.empty())
                .isPresent(false)
                .build();

        var activities = List.of(
                mathIgorPetrov1Mark12, writingIgorPetrovMark12, englishIgorPetrovMark12,
                mathOlegIvanovMark10, writingOlegIvanovMark10, englishOlegIvanovMark10,
                mathMaximSvetlovMark12, writingMaximSvetlovNoMark, englishMaximSvetlovNoMark,
                mathIrinaKasanovaNoMark, writingIrinaKasanovaNoMark, englishIrinaKasanovaNoMark
        );
        var activities1 = List.of(
                mathIgorPetrov1Mark12, math2IgorPetrov1Mark9, math3IgorPetrov1NoMark, writingIgorPetrovMark12,
                englishIgorPetrovMark12,
                mathOlegIvanovMark10, writingOlegIvanovMark10, englishOlegIvanovMark10,
                mathMaximSvetlovMark12, writingMaximSvetlovNoMark, englishMaximSvetlovNoMark,
                mathIrinaKasanovaNoMark, writingIrinaKasanovaNoMark, englishIrinaKasanovaNoMark,
                mathSvetlanaLimovaMark7, writingSvetlanaLimovaMark6, englishSvetlanaLimovaMark5,
                mathMariaBelovaMark10, writingMariaBelovaMark9, englishMariaBelovaMark5,
                mathElenaKolesovaMark12, readingElenaKolesovaMark10, writingElenaKolesovaNoMark,
                mathOlexandrLitvinovMark5, readingOlexandrLitvinovNoMark, writingOlexandrLitvinovMark6,
                mathSophiaMininaMark12, readingSophiaMininaMark9, writingSophiaMininaNoMark
        );
        var lessons = List.of(
                mathLessonFor1A, writingLessonFor1A, englishLessonFor1A,
                mathLessonFor1B, writingLessonFor1B, englishLessonFor1B,
                mathLessonFor2A, writingLessonFor2A, readingLessonFor2A
        );
        System.out.println(findBestTruantsInSchool(activities));
        System.out.println(findBestTruantsInGroup(activities, group1A.getId()));
        System.out.println(find3BestStudentsInSchool(activities));
        System.out.println(find3BestStudentsInSchoolStream(activities));
        System.out.println(find3BestStudentsInGroupStream(activities1, group1B.getId()));
        System.out.println(findStudentsAbsentAtSpecificDate(activities1,
                OffsetDateTime.parse("2022-09-22T09:00:00+01:00")));
        System.out.println(findNumberLessonsFromTeacherAtSpecificDay(lessons,
                teacherIrinaKoroseva.getId(),
                OffsetDateTime.parse("2022-09-21T09:00:00+01:00")));
        System.out.println(findAvgMarkInSubject(activities1, studentIgorPetrov1A.getId(), maths.getId()));
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

    //method that get a list of students who was absent in specific day
    private static Set<UUID> findStudentsAbsentAtSpecificDate(List<Activity> activities, OffsetDateTime date) {
        return activities.stream()
                .filter(e -> e.getLesson().getStartDate().toLocalDate().equals(date.toLocalDate()))
                .filter(e -> !e.isPresent())
                .map(e -> e.getStudent().getId())
                .collect(Collectors.toSet());
    }

    //method that get the number of lessons taught by a particular teacher on a particular day
    private static long findNumberLessonsFromTeacherAtSpecificDay(List<Lesson> lessons,
                                                                  UUID teacherId,
                                                                  OffsetDateTime date) {
        return lessons.stream()
                .filter(lesson -> lesson.getStartDate().toLocalDate().equals(date.toLocalDate()))
                .filter(lesson -> lesson.getTeacher().getId().equals(teacherId))
                .count();
    }

    //method that find average mark of student in specific subject
    private static double findAvgMarkInSubject(List<Activity> activities, UUID studentId, UUID subjectId) {
        return activities.stream()
                .filter(e -> e.getStudent().getId().equals(studentId))
                .filter(e -> e.getLesson().getSubject().getId().equals(subjectId))
                .filter(Activity::isPresent)
                .collect(averagingDouble(e -> e.getMark().orElse(0)));
    }
    // finish another task
}
