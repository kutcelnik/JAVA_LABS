package university.controller;

import university.model.Group;

public class GroupCreator {

    public Group create(String name) {
        return new Group(name);
    }
}
