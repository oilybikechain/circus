package circus;

import circus.animal.*;
import circus.equipment.Equipment;
import circus.equipment.Cannon;
import circus.equipment.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateValue(Asset[] assets) {
        int total = 0;
        for (Asset asset : assets) {
            if (asset.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + asset.getValue());
            } else {
                total += asset.getValue();
                System.out.println("Adding item value: " + asset.getValue());
                // some
                // more
                // code
                // here ...
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Number og animals in the circus: " + animals.length);

        printAllAnimals();

        System.out.println("Number of animals in the circus: " + animals.length);

        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));

        printAllAnimals(animalArrayList);

        animalArrayList.add(new Elephant("StrongOne"));
        printAllAnimals(animalArrayList);
        System.out.println("Size of array list: " + animalArrayList.size());

        Parrot andy = new Parrot("Andy");


    //        makeAnimalsTalk();
//        System.out.println("Total value of animals " + calculateValue(animals));
//        System.out.println("Total value of equipments " + calculateValue(equipments));
    }

    private static void printAllAnimals(ArrayList<Animal> animals) {
        for(Animal a : animals) {
            System.out.println(a);
        }
    }

    private static void printAllAnimals() {
        for(Animal a : animals) {
            System.out.println(a);
        }
    }

    private static Animal findAnimalRefernce(ArrayList<Animal> animals, String nameOfAnimal) {
        for(Animal a : animals) {
            if (a.name == nameOfAnimal) {
                return a;
            }
        }
        return null;
    }
}