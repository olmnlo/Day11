public class Instructor extends Person {
    private int salary;

    public Instructor(){
        super();
    }
    public Instructor(String name, String email, int age, String phone_number, int salary){
        super(name, email, age, phone_number);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
