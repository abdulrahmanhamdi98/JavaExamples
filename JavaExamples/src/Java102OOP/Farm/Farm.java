package Java102OOP.Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private final List<Animal> animals;

    public Farm() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void makeNoise() {
        for (Animal animal : animals) {
            animal.makeNoise();
        }
    }

    public static void main(String[] args) {
        Farm myFarm = new Farm();

        Cow cow1 = new Cow("Bessie");
        Cow cow2 = new Cow("Moo-Moo");
        Sheep sheep1 = new Sheep("Shaun");
        Sheep sheep2 = new Sheep("Fluffy");
        Dog dog1 = new Dog("Rex");

        myFarm.addAnimal(cow1);
        myFarm.addAnimal(cow2);
        myFarm.addAnimal(sheep1);
        myFarm.addAnimal(sheep2);
        myFarm.addAnimal(dog1);

        myFarm.makeNoise();
    }
}
