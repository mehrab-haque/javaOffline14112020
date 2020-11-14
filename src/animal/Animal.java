package animal;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+" is a "+this.getClass().getName().split("\\.")[2]+", aged "+age;
    }
}