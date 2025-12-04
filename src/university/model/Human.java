package university.model;

public abstract class Human {
    protected String firstName;
    protected String lastName;
    protected String fatherName;
    protected Sex sex;

    public Human(String firstName, String lastName, String fatherName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + fatherName + " (" + sex + ")";
    }
}
