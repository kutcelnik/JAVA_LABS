package university;

import university.controller.UniversityCreator;
import university.model.University;

public class Run {

    public static void main(String[] args) {

        University university = UniversityCreator.createFullUniversity();

        System.out.println("Университет успешно создан:");
        System.out.println(university);
    }
}

