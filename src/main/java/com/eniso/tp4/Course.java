package com.eniso.tp4;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<String> contents;
    private float coef;

    public Course(String name, List<String> contents, float coef) {
        this.name = name;
        this.contents = new ArrayList<>(contents);
        this.coef = coef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    public float getCoef() {
        return coef;
    }

    public void setCoef(float coef) {
        this.coef = coef;
    }
}
