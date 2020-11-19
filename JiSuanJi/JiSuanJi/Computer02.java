package JiSuanJi;

public class Computer02 {
    String name="天河二号";
    int price= 20000;
    Intel cpu =new Intel("cpu2",1,600);
    Kingston Memory=new Kingston("memory2",2,1500);
    WestDigitals HardDisk=new WestDigitals("harddisk2",2,1800);
    Asus MainBoard=new Asus("mainboard2",40,2300);
    public void print(){
        System.out.println("以下是"+name+"的信息");
        System.out.println("这台计算机卖"+price);
        cpu.setName("intel i11");           //CPU部分
        cpu.setPrice(10001);
        cpu.setCoreNum(477);
        System.out.println("cpu_name: "+cpu.getName());
        System.out.println("cpu_price: "+cpu.getPrice());
        System.out.println("cpu_corenum: "+cpu.getCoreNum());
        System.out.println();

        Memory.setName("kingston");     //内存部分
        Memory.setPrice(943);
        Memory.setVolume(237);
        System.out.println("memory_name: "+Memory.getName());
        System.out.println("memory_price: "+Memory.getPrice());
        System.out.println("memory_volume: "+Memory.getVolume());
        System.out.println();

        HardDisk.setName("westdigital");       //硬盘部分
        HardDisk.setPrice(624);
        HardDisk.setVolume(265);
        System.out.println("hard disk_name: "+HardDisk.getName());
        System.out.println("hard disk_price: "+HardDisk.getPrice());
        System.out.println("hard disk_volume: "+HardDisk.getVolume());
        System.out.println();

        MainBoard.setName("asus");     //主板部分
        MainBoard.setPrice(938);
        MainBoard.setSpeed(200);
        System.out.println("main board_name: "+MainBoard.getName());
        System.out.println("main board_price: "+MainBoard.getPrice());
        System.out.println("main board_volume: "+MainBoard.getSpeed());
        System.out.println();
    }
}
