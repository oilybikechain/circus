package circus;

import circus.equipment.Equipment;
import circus.equipment.Cannon;
import circus.equipment.Ladder;

import circus.animal.Tiger;
import circus.animal.Animal;
import circus.animal.Duck;
import circus.animal.Parrot;

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
        makeAnimalsTalk();
        System.out.println("Total value of animals " + calculateValue(animals));
        System.out.println("Total value of equipments " + calculateValue(equipments));
    }
}