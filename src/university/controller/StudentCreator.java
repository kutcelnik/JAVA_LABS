package university.controller;

import university.model.*;

public class StudentCreator implements HumanCreator {

    @Override
    public Student create(String firstName, String lastName, String fatherName, Sex sex) {
        return new Student(firstName, lastName, fatherName, sex);
    }
}
