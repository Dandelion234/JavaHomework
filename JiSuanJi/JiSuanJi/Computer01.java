package JiSuanJi;

public class Computer01 {
    String name="天河一号";
    int price=1000000;
    Intel cpu =new Intel("superCpu",8888,999);
    Samsung Memory=new Samsung("samsung",8848,1234);
    Seagate HardDisk=new Seagate("Seagate",9999,567);
    Gigabyte MainBoard=new Gigabyte("gigabyte",666,789);

    public void print(){
        System.out.println("以下是"+name+"的信息");
        System.out.println("这台计算机价格为： "+price);
//        cpu.setName("superCpu");           //CPU部分
//        cpu.setPrice(8888);
//        cpu.setCoreNum(999);
        System.out.println("cpu_name: "+cpu.getName());
        System.out.println("cpu_price: "+cpu.getPrice());
        System.out.println("cpu_corenum: "+cpu.getCoreNum());
        System.out.println();

//        Memory.setName("samsung");     //内存部分
//        Memory.setPrice(8848);
//        Memory.setVolume(1234);
        System.out.println("memory_name: "+Memory.getName());
        System.out.println("memory_price: "+Memory.getPrice());
        System.out.println("memory_volume: "+Memory.getVolume());
        System.out.println();

//        HardDisk.setName("Seagate");       //硬盘部分
//        HardDisk.setPrice(9999);
//        HardDisk.setVolume(567);
        System.out.println("hard disk_name: "+HardDisk.getName());
        System.out.println("hard disk_price: "+HardDisk.getPrice());
        System.out.println("hard disk_volume: "+HardDisk.getVolume());
        System.out.println();

//        MainBoard.setName("gigabyte");     //主板部分
//        MainBoard.setPrice(666);
//        MainBoard.setVolume(789);
        System.out.println("main board_name: "+MainBoard.getName());
        System.out.println("main board_price: "+MainBoard.getPrice());
        System.out.println("main board_volume: "+MainBoard.getSpeed());
        System.out.println();
    }



    }



