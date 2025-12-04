package university.controller;

import university.model.*;

public class UniversityCreator {

    public static University createFullUniversity() {

        // 1. Создаем университет
        University university = new University("My University");

        // 2. Создаем факультеты
        Faculty faculty1 = new Faculty("Computer Science");
        Faculty faculty2 = new Faculty("Mathematics");

        // 3. Создаем кафедры
        Department dep1 = new Department("Software Engineering");
        Department dep2 = new Department("Cybersecurity");
        Department dep3 = new Department("Algebra");

        // 4. Создаем группы
        Group group1 = new Group("CS-101");
        Group group2 = new Group("CS-102");
        Group group3 = new Group("MATH-201");

        // 5. Добавляем студентов
        group1.addStudent(new Student("Anna", "Petrova", "Ivanivna", Sex.FEMALE));
        group1.addStudent(new Student("Oleg", "Koval", "Petrovych", Sex.MALE));

        group2.addStudent(new Student("Maria", "Sydorenko", "Oleksandrivna", Sex.FEMALE));

        group3.addStudent(new Student("Danylo", "Tkachenko", "Serhiyovych", Sex.MALE));

        // 6. Кафедры получают группы
        dep1.addGroup(group1);
        dep1.addGroup(group2);

        dep3.addGroup(group3);

        // 7. Факультеты получают кафедры
        faculty1.addDepartment(dep1);
        faculty1.addDepartment(dep2);
        faculty2.addDepartment(dep3);

        // 8. Университет получает факультеты
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        return university;
    }
}
