public class Dolphin extends Mammal implements Swimable{

    public Dolphin(String Name) {
        super(Name);
    }

    @Override
    public String swim() {
        return "The dolphin playfully swims in the sea.";
    }

    @Override
    public String makeSound() {
        return "Clicking sounds";
    }
    
}
