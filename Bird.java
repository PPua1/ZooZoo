public class Bird extends Animal{

    public Bird(String Name) {
        super(Name);
    }

    @Override
    public String makeSound() {
        return "Bird chirp";
    }
    
}