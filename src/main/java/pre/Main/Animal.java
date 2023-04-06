package pre.Main;

public class Animal {
    public void animalSound(){
        System.out.println("------------------");
    }
}
class Dog extends Animal{
    @Override
    public void animalSound() {
        super.animalSound();
        System.out.println("bhau bhau");
    }

    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.animalSound();
        System.out.println(animal);
    }
}
