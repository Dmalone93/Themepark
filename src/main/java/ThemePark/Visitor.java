package ThemePark;

public class Visitor {


    private double height;
    private int money;
    private int age;

    public Visitor(double height, int money, int age){
        this.height = height;
        this.money = money;
        this.age = age;

    }

    public double getHeight() {
        return this.height;
    }

    public int getMoney() {
        return this.money;
    }

    public int getAge() {
        return this.age;
    }
}
