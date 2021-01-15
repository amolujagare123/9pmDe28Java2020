package InheritanceDemos;

public class Animal1 {

    void iAmAnimal()
    {
        System.out.println("iAmAnimal");
    }
}

class Mamal extends  Animal1
{

    void iAmMamal()
    {
        System.out.println("iAmMamal");
    }
}

class Reptile extends  Animal1
{

    void iAmReptile()
    {
        System.out.println("iAmReptile");
    }
}


class Tiger extends  Mamal
{

    void iAmTiger()
    {
        System.out.println("iAmTiger");
    }
}


class TestInheritance
{
    public static void main(String[] args) {

        Animal1 animal1 = new Animal1();
        animal1.iAmAnimal();

        Mamal mamal = new Mamal();
        mamal.iAmMamal();
        mamal.iAmAnimal();

        Reptile reptile = new Reptile();
        reptile.iAmReptile();
        reptile.iAmAnimal();

        Tiger tiger = new Tiger();
        tiger.iAmTiger();
        tiger.iAmMamal();
        tiger.iAmAnimal();


    }
}