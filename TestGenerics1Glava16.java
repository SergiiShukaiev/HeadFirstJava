package HeadFirstJava;

/**
 * Created by Алина on 04.09.2016.
 */
import java.util.*;

public class TestGenerics1Glava16
{
    public static void main(String[] args){
        new TestGenerics1Glava16().gp();
    }

    public void gp(){
      //  Animal[] animals={new Dog(), new Cat(), new Dog()};
       // Dog[] dogs={new Dog(), new Dog(), new Dog()};

        ArrayList<Animal> animals=new ArrayList<Animal>();

        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        takeAnimals(animals);

        ArrayList<Dog> dogs=new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
      //  takeAnimals(dogs);

    }

  /*  public void takeAnimals(Animal[] animals){
        for(Animal a: animals)
            a.eat();
    } */

    public void takeAnimals(ArrayList<Animal> animals){
        for (Animal a:animals)
            System.out.println("Животное ест");
    }
}

abstract class Animal {
    void eat(){
        System.out.println("Животное ест");
    }
}

class Dog extends Animal{
    void bark(){}
}
class Cat extends Animal{
    public void meow(){}
}