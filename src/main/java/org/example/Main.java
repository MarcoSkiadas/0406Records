package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Hans",22,"Berlin");
        Owner owner2 = new Owner("Jack",23,"München");
        Species species1 = new Species("dog",400);
        Species species2 = new Species("cat",200);
        Species species3 = new Species("mice",100);

    Animal animal1 = new Animal("1","Bello",species1,3,owner1);
    Animal animal2 = new Animal("2","Mr Kitten",species2,2,owner1);
    Animal animal3 = new Animal("3","Cheesy",species3,1,owner2);
    Animal animal4 = new Animal("4","BowWow",species1,1,owner2);

        System.out.println(animal1.name());
        System.out.println(animal2.age());
        System.out.println(animal1.name().equals(animal4.name()));
        System.out.println(animal1);

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);

        Zoo zoo = new Zoo(animals);

        System.out.println(zoo.totalFoodRequirement());







    }
}