package com.eniso.tp4;

import java.util.List;

public class Teacher extends User {
    private long hIndex;
    private List<Course> courses;

    public Teacher(String firstName, String lastName, String email, long cin, long hIndex, List<Course> courses) {
        super(firstName, lastName, email, cin);
        this.hIndex = hIndex;
        this.courses = courses;
    }

    public long getHIndex() {
        return hIndex;
    }

    public void setHIndex(long hIndex) {
        this.hIndex = hIndex;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void displayCoursesContent() {
        for (Course course : courses) {
            System.out.println("Course Name: " + course.getName());
            System.out.println("Contents: " + course.getContents());
            System.out.println("Coefficient: " + course.getCoef());
            System.out.println();
        }
    }

    public String displayInfo() {
        String info = "Teacher Information: " +
                "First Name: " + this.getFirstName() + ", " +
                "Last Name: " + this.getLastName() + ", " +
                "Email: " + this.getEmail() + ", " +
                "CIN: " + this.getCin() + ", " +
                "hIndex: " + this.getHIndex();
        System.out.println(info);
        return info;
    }
}
