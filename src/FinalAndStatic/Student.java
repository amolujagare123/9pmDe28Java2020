package FinalAndStatic;

public class Student {

    int rno;
    String name;
    String college="ITC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }


    public static void main(String[] args) {

        Student ob1 = new Student();
        ob1.rno =1;
        ob1.name = "Amol";
        ob1.college = "ABCD";

        Student ob2 = new Student();
        ob2.rno =2;
        ob2.name="Kajal";
        ob2.college="PICT";

        ob1.display(); // college
        ob2.display(); // college
    }

}
