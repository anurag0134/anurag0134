public class Student
{
    String name;
    int age;
    String gender;
    int usn;
    void eat()
    {
        System.out.println("student is eating");
    }
    void sleep()
    {
        System.out.println("student is sleeping");
    }
    void studentStudy()
    {
        System.out.println(" student is studying");
    }
}
class StudentApp
{
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.eat();
        s2.sleep();
        s3.studentStudy();
        s1.name = "raju";
        s1.age = 22;
        s1.gender = "male";
        s1.usn = 123;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        System.out.println(s1.usn);
    
    }
}