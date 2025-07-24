abstract class Animal {
    private final String Name;

    public Animal(String Name) {
        this.Name = Name;
    }


    public String getName(){
        return Name;
    }

    public abstract String makeSound();



}
