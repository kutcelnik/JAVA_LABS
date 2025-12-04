package university.controller;

import university.model.Group;
import university.model.Human;

public class GroupCreator {

    public Group create(String name, Human head) {
        return new Group(name, head);
    }
}
