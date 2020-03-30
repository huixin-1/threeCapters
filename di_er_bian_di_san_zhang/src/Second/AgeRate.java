package Second;

import java.util.Scanner;

public class AgeRate {
    public static void main(String[] args) {
        //定义Scanner对象
        Scanner sc =new Scanner(System.in);
        //存储大于30岁的人数
        int ageUp = 0;
        //存储小于30岁的人数
        int ageDown =0;

        for (int i=1;i<11;i++){
            System.out.println("第"+i+"位顾客的年龄是：");
            int age = (int)sc.nextInt();
            if (age>30){
                ageUp++;
            }else {
                ageDown++;

            }

        }

        System.out.println("超过30岁人的数的比率是："+(ageUp/10.0*100)+"%");
        System.out.println("小于30岁人的数的比率是："+(ageDown/10.0*100)+"%");



    }
}
