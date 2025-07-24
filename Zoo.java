
import java.util.ArrayList;
public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Lion("aew"));
        animals.add(new Dolphin("arw"));
        animals.add(new Eagle("aea"));
        animals.add(new Penguin("aaa"));


        // รับค่าแล้วส่งออก ชื่อสัตว์และเสียงร้อง
        for (Animal animal : animals) {
            System.out.print(animal.getName());
            System.out.print("\t" + animal.makeSound() + "\n");
            System.out.println("---------------------");
        }

        System.out.println("************************************************");
        // วน instanceof
        for (Animal animal : animals) {
            System.out.print("\n" + animal.getName());
            System.out.print("\t" + animal.makeSound() + "\t");
            if (animal instanceof Flyable){
                Flyable wing = (Flyable) animal ;
                System.out.print("\t" + wing.fly() + "\n");
            } else if(animal instanceof Swimable) {
                Swimable creep = (Swimable) animal ;
                System.out.print("\t" + creep.swim() + "\n");
            } else System.out.print("\t" +"walk around" + "\n");
        }

    }
}
