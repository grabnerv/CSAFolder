
public class StudentTester
{
    public static void main(String [] args){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.addAssignment(9, 10);
        s1.addAssignment(45, 50);
        s2.addAssignment(8, 10);
        s2.addAssignment(50, 50);
        System.out.println(s1);
        System.out.println(s2);

    }
}
