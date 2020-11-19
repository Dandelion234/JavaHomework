package JiSuanJi;

public class Computer03 {
    String name="天河三号";
    AMD cpu =new AMD("cpu3",4,1800);
    Samsung Memory=new Samsung("memory3",21,1800);
    WestDigitals HardDisk=new WestDigitals("harddisk3",2,1000);
    Gigabyte MainBoard=new Gigabyte("mainboard3",30,2000);
    public void print(){
        System.out.println("以下是"+name+"的信息");
        cpu.setName("intel i12");           //CPU部分
        cpu.setPrice(1999);
        cpu.setCoreNum(356);
        System.out.println("cpu_name: "+cpu.getName());
        System.out.println("cpu_price: "+cpu.getPrice());
        System.out.println("cpu_corenum: "+cpu.getCoreNum());
        System.out.println();

        Memory.setName("samsung");     //内存部分
        Memory.setPrice(456);
        Memory.setVolume(889);
        System.out.println("memory_name: "+Memory.getName());
        System.out.println("memory_price: "+Memory.getPrice());
        System.out.println("memory_volume: "+Memory.getVolume());
        System.out.println();

        HardDisk.setName("westdigital");       //硬盘部分
        HardDisk.setPrice(157);
        HardDisk.setVolume(975);
        System.out.println("hard disk_name: "+HardDisk.getName());
        System.out.println("hard disk_price: "+HardDisk.getPrice());
        System.out.println("hard disk_volume: "+HardDisk.getVolume());
        System.out.println();

        MainBoard.setName("gigabyte");     //主板部分
        MainBoard.setPrice(546);
        MainBoard.setSpeed(866);
        System.out.println("main board_name: "+MainBoard.getName());
        System.out.println("main board_price: "+MainBoard.getPrice());
        System.out.println("main board_volume: "+MainBoard.getSpeed());

    }

    public static void main(String[] args) {
        Computer03 method =new Computer03();
        method.print();
    }

}
