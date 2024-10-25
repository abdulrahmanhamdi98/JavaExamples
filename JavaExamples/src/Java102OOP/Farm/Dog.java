package Java102OOP.Farm;
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("The dog named " + name + " says: Woof!");
    }
}
