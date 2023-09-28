package ra.abstractclass;

public abstract class Animals {
    private String color;
    private int footCount;

    public abstract void makeSound();

    public void move(){
        System.out.println("đang di chuyển");
    }
}
