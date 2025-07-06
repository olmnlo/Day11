public class Student {
    private String name;
    private String id;
    private String email;
    private String phone_number;
    private int age;
    private double gpa;
    private String college_name;

    public Student(){
        this.name = null;
        this.id = null;
        this.email = null;
        this.phone_number = null;
        this.age = 0;
        this.gpa = 0;
        this.college_name = null;
    }

    public Student(String name, String id, String email, String phone_number, int age, double gpa, String college_name) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone_number = phone_number;
        this.age = age;
        this.gpa = gpa;
        this.college_name = college_name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", college_name='" + college_name + '\'' +
                '}';
    }
}
