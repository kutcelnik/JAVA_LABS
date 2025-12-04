package university.controller;

import university.model.Human;
import university.model.Sex;

public interface HumanCreator {
    Human create(String firstName, String lastName, String fatherName, Sex sex);
}
