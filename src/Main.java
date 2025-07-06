public class Main {
    public static void main(String[] args) {
        //Exercise 06
// Classrooooooooooooooooooooooooooooooooooooooooooooooooooooooooooom
        System.out.println();
        Student s1 = new Student();
        s1.setName("Hussam");
        s1.setAge(28);
        s1.setGpa(3);
        s1.setPhone_number("0501116147");
        s1.setId("12345678");
        s1.setEmail(s1.getName() + "@gmail.com");
        Student s2 = new Student();
        s2.setName("Faisal");
        s2.setAge(23);
        s2.setGpa(3.3);
        s2.setPhone_number("0501116147");
        s2.setId("12345678");
        s2.setEmail(s2.getName() + "@gmail.com");
        Student s3 = new Student();
        s3.setName("Ziyad");
        s3.setAge(33);
        s3.setGpa(3.1);
        s3.setPhone_number("0501116147");
        s3.setId("12345678");
        s3.setEmail(s3.getName() + "@gmail.com");
        Student s4 = new Student();
        s4.setName("Abdulrahman");
        s4.setAge(21);
        s4.setGpa(2.4);
        s4.setPhone_number("0501116147");
        s4.setId("12345678");
        s4.setEmail(s4.getName() + "@gmail.com");
        Student s5 = new Student();
        s5.setName("Hussam");
        s5.setAge(20);
        s5.setGpa(3.34);
        s5.setPhone_number("0501116147");
        s5.setId("12345678");
        s5.setEmail(s5.getName() + "@gmail.com");

        System.out.println("your name is: "+ s1.getName());
        System.out.println("your age is: "+ s1.getAge());
        System.out.println("your email is: "+ s1.getEmail());
        System.out.println("your gpa is: "+ s1.getGpa());
        System.out.println("your phone number is: "+ s1.getPhone_number());
        System.out.println("your id is: "+ s1.getId());

        System.out.println("your name is: "+ s2.getName());
        System.out.println("your age is: "+ s2.getAge());
        System.out.println("your email is: "+ s2.getEmail());
        System.out.println("your gpa is: "+ s2.getGpa());
        System.out.println("your phone number is: "+ s2.getPhone_number());
        System.out.println("your id is: "+ s2.getId());

        System.out.println("your name is: "+ s3.getName());
        System.out.println("your age is: "+ s3.getAge());
        System.out.println("your email is: "+ s3.getEmail());
        System.out.println("your gpa is: "+ s3.getGpa());
        System.out.println("your phone number is: "+ s3.getPhone_number());
        System.out.println("your id is: "+ s3.getId());

        System.out.println("your name is: "+ s4.getName());
        System.out.println("your age is: "+ s4.getAge());
        System.out.println("your email is: "+ s4.getEmail());
        System.out.println("your gpa is: "+ s4.getGpa());
        System.out.println("your phone number is: "+ s4.getPhone_number());
        System.out.println("your id is: "+ s4.getId());

        System.out.println("your name is: "+ s5.getName());
        System.out.println("your age is: "+ s5.getAge());
        System.out.println("your email is: "+ s5.getEmail());
        System.out.println("your gpa is: "+ s5.getGpa());
        System.out.println("your phone number is: "+ s5.getPhone_number());
        System.out.println("your id is: "+ s5.getId());




//        ArrayList<Student> s = new ArrayList<>();
//        Scanner scn = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter name: ");
//            String name = scn.next();
//            s.add(new Student());
//            s.get(i).name = name;
//        }
//        for (Student j : s){
//            System.out.println("your name is: "+j.name+" ");
//        }
//
//        System.out.println();
//        Student s1 = new Student();
//        s1.name = "Hussam";
//        s1.age = 23;
//        s1.gpa = 3;
//        s1.phone_number = "0501116147";
//        s1.id = "12345678";
//        s1.email = s1.name+"@gmail.com";
//        Student s2 = new Student();
//        s2.name = "Faisal";
//        s2.age = 23;
//        s2.gpa = 3;
//        s2.phone_number = "0501116147";
//        s2.id = "12345678";
//        s2.email = s2.name+"@gmail.com";
//        Student s3 = new Student();
//        s3.name = "Ziyad";
//        s3.age = 23;
//        s3.gpa = 3;
//        s3.phone_number = "0501116147";
//        s3.id = "12345678";
//        s3.email = s3.name+"@gmail.com";
//        Student s4 = new Student();
//        s4.name = "Abdulrahman";
//        s4.age = 23;
//        s4.gpa = 3;
//        s4.phone_number = "0501116147";
//        s4.id = "12345678";
//        s4.email = s4.name+"@gmail.com";
//        Student s5 = new Student();
//        s5.name = "Hussam";
//        s5.age = 23;
//        s5.gpa = 3;
//        s5.phone_number = "0501116147";
//        s5.id = "12345678";
//        s5.email = s5.name+"@gmail.com";
//
//        System.out.println("your name is: "+ s1.name);
//        System.out.println("your age is: "+ s1.age);
//        System.out.println("your email is: "+s1.email);
//        System.out.println("your gpa is: "+s1.gpa);
//        System.out.println("your phone number is: "+s1.phone_number);
//        System.out.println("your id is: "+ s1.id);
//
//        System.out.println("your name is: "+ s2.name);
//        System.out.println("your age is: "+ s2.age);
//        System.out.println("your email is: "+s2.email);
//        System.out.println("your gpa is: "+s2.gpa);
//        System.out.println("your phone number is: "+s2.phone_number);
//        System.out.println("your id is: "+ s2.id);
//
//        System.out.println("your name is: "+ s3.name);
//        System.out.println("your age is: "+ s3.age);
//        System.out.println("your email is: "+s3.email);
//        System.out.println("your gpa is: "+s3.gpa);
//        System.out.println("your phone number is: "+s3.phone_number);
//        System.out.println("your id is: "+ s3.id);
//
//        System.out.println("your name is: "+ s4.name);
//        System.out.println("your age is: "+ s4.age);
//        System.out.println("your email is: "+s4.email);
//        System.out.println("your gpa is: "+s4.gpa);
//        System.out.println("your phone number is: "+s4.phone_number);
//        System.out.println("your id is: "+ s4.id);
//
//        System.out.println("your name is: "+ s5.name);
//        System.out.println("your age is: "+ s5.age);
//        System.out.println("your email is: "+s5.email);
//        System.out.println("your gpa is: "+s5.gpa);
//        System.out.println("your phone number is: "+s5.phone_number);
//        System.out.println("your id is: "+ s5.id);

    }
}