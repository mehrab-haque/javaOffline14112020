import animal.Animal;
import animal.Venomous;
import animal.arachnoid.Arachnid;
import animal.arachnoid.RedBackSpider;
import animal.bird.Albatross;
import animal.bird.Bird;
import animal.fish.Fish;
import animal.fish.GreatWhiteShark;
import animal.mammal.*;
import animal.reptile.EasternBrownSnake;
import animal.reptile.Reptile;

public class Main {
    public static void main(String[] args) {
        Bird alex = new Albatross("Alex", 39);
        Mammal spot = new Dog("Spot", 7);
        Mammal fred = new FruitBat("Fred", 10);
        Reptile steph = new EasternBrownSnake("Steph", 12);
        Fish bruce = new GreatWhiteShark("Bruce", 40);
        Arachnid charlotte = new RedBackSpider("Charlotte", 1);
        Mammal perry = new Platypus("Perry", 5);
        Mammal bob = new Human("Bob", 20);

        Animal[] animals = {alex, spot, fred, steph, bruce, charlotte, perry, bob};
        for (Animal a: animals) {
            System.out.print(a);
            if (a instanceof Mammal) {
                ((Mammal) a).printBloodType();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The following animals are venomous: ");
        for (Animal a: animals) {
            if (a instanceof Venomous) {
                boolean deadly = ((Venomous) a).isLethalToAdultHumans();
                System.out.println(a + (deadly? ", and it's lethal!" : ", and fortunately non-lethal"));
            }
        }
    }
}