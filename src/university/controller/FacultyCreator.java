package university.controller;

import university.model.Faculty;
import university.model.Human;

public class FacultyCreator {

    public Faculty create(String name, Human head) {
        return new Faculty(name, head);
    }
}
