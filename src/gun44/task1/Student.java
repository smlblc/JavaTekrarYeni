package gun44.task1;

public class Student extends Person {
    private School school;
    private double fee;

    public Student(String name, String address, School school, double fee) {
        super(name, address);
        this.school = school;
        this.fee = fee;
    }


    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "\n\nStudent" +
                "\nschool: " + school.getName() +
                super.toString() +
                "\nfee: " + fee;
    }

}
