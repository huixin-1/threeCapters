package nine.homework;

public class TestMotoVechicle {
    public static void main(String[] args) {
//MotoVehicle moto=new MotoVehicle();
        Car car=new Car(1,"宝马","1");
        System.out.println("租金是："+car.CalcRent(5));
        Bus bus=new Bus(2,"金龙",20);
        System.out.println("租金是："+bus.CalcRent(5));
    }
}
