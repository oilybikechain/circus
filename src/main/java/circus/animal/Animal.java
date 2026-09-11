package circus.animal;

import circus.Asset;

import java.util.Comparator;
import java.util.Locale;

public abstract class Animal implements Asset {

    public String name;
    public abstract String speak();

    public abstract int getValue();

    public static Comparator<Animal> animalNameComparator = new Comparator<Animal>() {
        @Override
        public int compare(Animal animal1, Animal animal2) {
            return animal1.name.compareToIgnoreCase(animal2.name);
        }
    };
}
