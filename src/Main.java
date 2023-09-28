import ra.abstractclass.Animals;
import ra.abstractclass.Cat;
import ra.abstractclass.Dog;
import ra.inter_face.ArrayBusiness;
import ra.inter_face.ICrud;
import ra.inter_face.ListBussiness;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animals dog = new Dog();
        cat.makeSound();
        cat.move();
        cat.catchMouse();
        dog.makeSound();
        ICrud array = new ListBussiness();
        array.displayAll();

        ICrud.getOne();
    }
}