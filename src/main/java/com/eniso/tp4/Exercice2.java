
package com.eniso.tp4;
import java.util.*;

public class Exercice2 {
public static void main(String[] args) {
Student Student = new Student("student1", "student1", "student@email.com", 12345, 15.0, Classe.IA1_2, Status.NON_REDOUBLANT);
Student.displayInfo();
Student.updateProfile("student11", "student11", "john.doe.new@email.com");
Student.displayInfo();
boolean isAuthenticatedStudent = Student.authenticate();
System.out.println("Student Authentication: " + isAuthenticatedStudent);
Course mathCourse = new Course("Math", new ArrayList(List.of("Algebra", "Calculus")), 2.0f);
Course physicsCourse = new Course("Physics", new ArrayList(List.of("Mechanics", "Thermodynamics")),1.5f);
Teacher teacher = new Teacher("teacher1", "teacher1", "teacher1@email.com", 67890L, 12L, new ArrayList(List.of(mathCourse, physicsCourse)));
teacher.setHIndex(10L);
teacher.displayInfo();
teacher.displayCoursesContent();
StaffMember staffMember = new StaffMember("member1", "member1", "member1@email.com", 11111L,3,"Engineer", 5, new ArrayList(List.of("Task1", "Task2", "Task3")));
staffMember.displayInfo();
staffMember.finishTask("Task2");
staffMember.displayInfo();
}
}
