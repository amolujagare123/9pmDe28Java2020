package InheritanceDemos;

public class Animal {

    void eat()
    {
        System.out.println("eat");
    }
}

class Dog extends Animal
{

    void bark()
    {
        System.out.println("barks");
    }
}


class BabyDog extends  Dog
{

    void weeps()
    {
        System.out.println("weeps");
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        BabyDog babyDog = new BabyDog();
        babyDog.weeps();
        babyDog.bark();
        babyDog.eat();

    }

}
