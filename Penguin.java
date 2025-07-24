public class Penguin extends Bird implements Swimable {

    public Penguin(String Name) {
        super(Name);
    }

    @Override
    public String swim() {
        return "The penguin dives gracefully in the water.";
    }

    @Override
    public String makeSound() {
        return "Squawk!";
    }
}
