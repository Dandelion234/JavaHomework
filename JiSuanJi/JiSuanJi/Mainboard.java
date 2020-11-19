package JiSuanJi;

public abstract class Mainboard {
    private String name;
    private int speed;
    private int price;



    public Mainboard(String name, int speed, int price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int volume) {
        this.speed = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print(){
        System.out.println("主板 work");

    }
}
