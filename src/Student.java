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
        setName(name);
        this.id = id;
        setEmail(email);
        setPhone_number(phone_number);
        setAge(age);
        this.gpa = gpa;
        this.college_name = college_name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name.length() >= 8){
            System.out.printf("your name %s is long\n", name);
        }else if (name.length() >= 5){
            System.out.printf("your name %s is medium\n", name);
        }else {
            System.out.printf("your name %s is short\n", name);
        }
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
        if (age >= 20){
            System.out.printf("your age:%d is old", age);
            this.age = age;
        }else {
            System.out.printf("your age:%d is teen", age);
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.matches(".*[@].*")){
            System.out.printf("your email is correct: %s\n", email);
            this.email = email;
        }else {
            System.out.println("it is not email\n");
        }
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        if (phone_number.length() != 10 && phone_number.startsWith("05") ){
            System.out.printf("your number %s is not correct",phone_number);
        }else {
            this.phone_number = phone_number;
        }
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
