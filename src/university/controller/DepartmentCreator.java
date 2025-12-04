package university.controller;

import university.model.Department;
import university.model.Human;

public class DepartmentCreator {

    public Department create(String name, Human head) {
        return new Department(name, head);
    }
}
