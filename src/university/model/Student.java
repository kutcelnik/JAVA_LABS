package university.model;

public class Student extends Human {

    public Student(String firstName, String lastName, String fatherName, Sex sex) {
        super(firstName, lastName, fatherName, sex);
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + "}";
    }

    // equals / hashCode наследуются от Human – этого достаточно
}
