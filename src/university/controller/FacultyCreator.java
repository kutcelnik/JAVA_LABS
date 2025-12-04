package university.controller;

import university.model.Faculty;

public class FacultyCreator {

    public Faculty create(String name) {
        return new Faculty(name);
    }
}

