package Second;
/*
return有两个基本用途
1、返回方法的返回值
2、终止当前程序
 */
public class ReturnDemo {
    public static void main(String[] args) {
        System.out.println(get());
        for(int i = 0;i < 10; i++){
            System.out.println(i);
            if (i==5){
                //return   和下面功能一样
                System.exit(-1);//里面这个数字  什莫意思都没有；就是退出；

            }
            System.out.println("接着执行");


        }

    }
    public static int get(){
        return 100;
    }




}
