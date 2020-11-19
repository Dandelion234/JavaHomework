package JiSuanJi;

public abstract class Memory {
    private String name;
    private int volume;
    private int price;
    public Memory(String name, int volume, int price) {
        this.name = name;
        this.price = price;
        this.volume = volume;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print(){
        System.out.println("内存 work");
    }
}
