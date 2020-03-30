package nine.homework;

public abstract class MotoVehicle {//不加abstract会报错的
    private int no;
    private String brand;


    public MotoVehicle(){

    }


    public MotoVehicle(int no,String brand){
        this.no=no;
        this.brand=brand;
    }



    public int getNo(){
        return no;
    }

    public void setNo(int no){
        this.no=no;
    }



    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }



    public abstract int CalcRent (int day);//当有这个之后，子类必须进行一个实现
}
