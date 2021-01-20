package FinalAndStatic;

public class StudentStatic {

    int rno;
    String name;
    static String college="ITC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }


    public static void main(String[] args) {

        StudentStatic ob1 = new StudentStatic();
        ob1.rno =1;
        ob1.name = "Amol";
        ob1.college="PICT";

        StudentStatic ob2 = new StudentStatic();
        ob2.rno =2;
        ob2.name="Kajal";


        StudentStatic ob3 = new StudentStatic();
        ob3.rno =3;
        ob3.name="Mahesh";
        ob3.college="GOV";

        StudentStatic ob4 = new StudentStatic();
        ob4.rno =4;
        ob4.name="Tushar";

        StudentStatic.college="VIT";


        ob1.display(); // college
        ob2.display(); // college
        ob3.display(); // college
        ob4.display(); // college
    }

}
