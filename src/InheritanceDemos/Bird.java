package InheritanceDemos;

public class Bird {

    void fly()
    {
        System.out.println("fly");
    }

}

class Sparrow extends Bird
{

    void colorYellow()
    {
        System.out.println("colorYellow");
    }
}

class Crow extends Bird
{

    void colorBlack()
    {
        System.out.println("colorBlack");
    }

    public static void main(String[] args) {

        Bird b = new Bird();
        b.fly();

        Sparrow s = new Sparrow();
        s.colorYellow();
        s.fly();

        Crow c = new Crow();
        c.colorBlack();
        c.fly();

    }
}
