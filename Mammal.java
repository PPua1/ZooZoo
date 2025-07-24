public class Mammal extends Animal {

    public Mammal(String Name) {
        super(Name);
    }

    @Override
    public String makeSound() {
        return "Mammal sound";
    }
    
}
