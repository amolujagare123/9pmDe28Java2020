package InheritanceDemos;

public class Employee {

    int salary =20000;

}

class Programmer extends  Employee
{
    int bonus= 5000;

    public static void main(String[] args) {

        Programmer ob = new Programmer();

        System.out.println(ob.bonus);

        System.out.println(ob.salary);


    }


}
