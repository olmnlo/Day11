public class FullTime extends Instructor{
    private int hours;

    public FullTime (String name, String email, int age, String phone_number, int salary, int hours){
        super(name, email, age, phone_number, salary);
        this.hours = hours;
        setSalary(salary);

    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(super.getSalary()+(this.hours*45));
    }

    @Override
    public String toString() {
        return "FullTime{"+
                "name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phone_number='" + getPhone_number() + '\'' +
                ", age=" + getAge() +
                ", hours=" + hours + '\'' +
                ", salary=" +  + getSalary() +'\''+
                '}';
    }
    }
