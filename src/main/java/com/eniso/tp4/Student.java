package com.eniso.tp4;

public class Student extends User {
    private double average;
    private Classe classe;
    private Status status;

    public Student(String firstName, String lastName, String email, long cin, double average, Classe classe, Status status) {
        super(firstName, lastName, email, cin);
        this.average = average;
        this.classe = classe;
        this.status = status;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String displayInfo() {
        String info = "Les informations de l'étudiant sont : " +
                "Prénom : " + this.getFirstName() + ", " +
                "Nom : " + this.getLastName() + ", " +
                "Email : " + this.getEmail() + ", " +
                "Moyenne : " + this.getAverage() + ", " +
                "Classe : " + this.getClasse() + ", " +
                "Statut : " + this.getStatus();
        System.out.println(info);
        return info;
    }

    public void updateProfile(String newFirstName, String newLastName, String newEmail) {
        this.setFirstName(newFirstName);
        this.setLastName(newLastName);
        this.setEmail(newEmail);
    }

    public boolean authenticate() {
        // Assuming authentication logic here
        return true;
    }
}
