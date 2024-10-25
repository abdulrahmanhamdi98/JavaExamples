package Java102OOP.Farm;
public class Sheep extends Animal {
    public Sheep(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("The sheep named " + name + " says: Baa!");
    }
}
