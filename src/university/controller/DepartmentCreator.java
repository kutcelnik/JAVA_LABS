package university.controller;

import university.model.Department;

public class DepartmentCreator {

    public Department create(String name) {
        return new Department(name);
    }
}

