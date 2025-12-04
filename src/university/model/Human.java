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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + fatherName + " (" + sex + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        return java.util.Objects.equals(firstName, human.firstName) &&
                java.util.Objects.equals(lastName, human.lastName) &&
                java.util.Objects.equals(fatherName, human.fatherName) &&
                sex == human.sex;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName, fatherName, sex);
    }
}


