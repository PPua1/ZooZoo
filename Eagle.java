public class Eagle extends Bird implements Flyable {

    public Eagle(String Name) {
        super(Name);
    }
    @Override
    public String fly() {
        return "The eagle soars through the sky.";
}
    @Override
    public String makeSound() {
        return "Screech!";
    }
}
