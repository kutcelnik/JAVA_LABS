package university.controller;

import university.model.Human;
import university.model.University;

public class UniversityCreator {

    public University create(String name, Human head) {
        return new University(name, head);
    }
}
