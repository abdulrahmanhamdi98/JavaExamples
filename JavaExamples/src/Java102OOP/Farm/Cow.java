package Java102OOP.Farm;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("The cow named " + name + " says: Moo!");
    }
}
