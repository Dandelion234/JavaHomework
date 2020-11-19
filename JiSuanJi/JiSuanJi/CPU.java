package JiSuanJi;

public abstract class CPU {
    private String  name;
    private int price;
    private int coreNum;



    public CPU(String name, int coreNum, int price) {
        this.name = name;
        this.price = price;
        this.coreNum = coreNum;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public void setCoreNum(int coreNum) {
        this.coreNum = coreNum;
    }

    public void print(){
        System.out.println("CPU work");
    }

}
