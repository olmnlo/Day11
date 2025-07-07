public class Student extends Person{
    private double gpa;

    public Student(){
        super();
    }
    public Student(String name, String id, String email, String phone_number, int age, double gpa, String college_name) {
        super(name, email, age, phone_number);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + super.getName() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", phone_number='" + super.getPhone_number() + '\'' +
                ", age=" + super.getAge() +
                ", gpa=" + gpa +
                '}';
    }
}
