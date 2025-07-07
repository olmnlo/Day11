public class PartTime extends Instructor{
    private int hours;
    public PartTime(String name, String email, int age, String phone_number, int salary, int hours){
        super(name, email, age, phone_number, salary);
        this.hours = hours;
        setSalary(salary);
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary((this.hours*45));
    }

    public String toString() {
        return "FullTime{"+
                "name='" + super.getName() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", phone_number='" + super.getPhone_number() + '\'' +
                ", age=" + super.getAge() +
                ", hours=" + hours + '\'' +
                ", salary=" +  + super.getSalary() +'\''+
                '}';
    }
}
