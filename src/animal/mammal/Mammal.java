package animal.mammal;

import animal.Animal;

public class Mammal extends Animal {
    public Mammal(String name,int age){
        super(name,age);
    }

    public void printBloodType(){
        System.out.print(", Warm-Blooded!");
    }
}
