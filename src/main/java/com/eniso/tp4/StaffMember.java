package com.eniso.tp4;

import java.util.ArrayList;
import java.util.List;

public class StaffMember extends User {
    private int experienceYears;
    private String role;
    private List<String> tasks;

public StaffMember(String firstName, String lastName, String email, long cin, int experienceYears, String role, int tasks, ArrayList arrayList) {
    super(firstName, lastName, email, cin);
    this.experienceYears = experienceYears;
    this.role = role;
    //this.tasks = tasks;
}


    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public void finishTask(String taskName) {
        if (tasks.contains(taskName)) {
            tasks.remove(taskName);
            System.out.println("Task '" + taskName + "' finished.");
        } else {
            System.out.println("Task '" + taskName + "' not found.");
        }
    }

    public String displayInfo() {
        String info = "Staff Member Information: " +
                "First Name: " + this.getFirstName() + ", " +
                "Last Name: " + this.getLastName() + ", " +
                "Email: " + this.getEmail() + ", " +
                "CIN: " + this.getCin() + ", " +
                "Experience Years: " + this.getExperienceYears() + ", " +
                "Role: " + this.getRole();
        System.out.println(info);
        return info;
    }
}
