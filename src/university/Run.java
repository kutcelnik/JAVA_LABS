package university;

import university.controller.*;
import university.model.*;

public class Run {

    public static void main(String[] args) {
        University u = createTypicalUniversity();
        System.out.println(u);
    }

    public static University createTypicalUniversity() {

        StudentCreator studentCreator = new StudentCreator();
        GroupCreator groupCreator = new GroupCreator();
        DepartmentCreator depCreator = new DepartmentCreator();
        FacultyCreator facCreator = new FacultyCreator();
        UniversityCreator uniCreator = new UniversityCreator();

        Human rector = studentCreator.create(
                "Іван", "Петров", "Олексійович", Sex.MALE);

        University university = uniCreator.create("Дніпровський Університет", rector);

        Human dean = studentCreator.create(
                "Марія", "Коваль", "Сергіївна", Sex.FEMALE);

        Faculty faculty = facCreator.create("Факультет ІТ", dean);
        university.addFaculty(faculty);

        Human head = studentCreator.create(
                "Олег", "Семенов", "Петрович", Sex.MALE);

        Department dep = depCreator.create("Кафедра Компʼютерних Наук", head);
        faculty.addDepartment(dep);

        Human curator = studentCreator.create(
                "Наталя", "Іваненко", "Петрівна", Sex.FEMALE);

        Group group = groupCreator.create("КН-21", curator);
        dep.addGroup(group);

        group.addStudent(studentCreator.create(
                "Поліна", "Куц", "Миколаївна", Sex.FEMALE));
        group.addStudent(studentCreator.create(
                "Ілля", "Биков", "Іванович", Sex.MALE));

        return university;
    }
}
