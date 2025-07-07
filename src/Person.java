public class Person {
    private String name;
    private String email;
    private int age;
    private String phone_number;


    public Person(){

    }

    public Person(String name, String email, int age, String phone_number){
        setName(name);
        setEmail(email);
        setAge(age);
        setPhone_number(phone_number);
    }

    public void setAge(int age) {
        if (age >= 20){
//            System.out.printf("your age:%d is old", age);
            this.age = age;
        }else {
            System.out.printf("your age:%d is teen", age);
        }
    }

    public int getAge() {
        return age;
    }

    public void setEmail(String email) {
        if (email.matches(".*[@].*")){
//            System.out.printf("your email is correct: %s\n", email);
            this.email = email;
        }else {
            System.out.println("it is not email\n");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
//        if (name.length() >= 8){
//            System.out.printf("your name %s is long\n", name);
//        }else if (name.length() >= 5){
//            System.out.printf("your name %s is medium\n", name);
//        }else {
//            System.out.printf("your name %s is short\n", name);
//        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone_number(String phone_number) {
        if (phone_number.length() != 10 && phone_number.startsWith("05") ){
            System.out.printf("your number %s is not correct",phone_number);
        }else {
            this.phone_number = phone_number;
        }
    }

    public String getPhone_number() {
        return phone_number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
