package Second;

import java.util.Scanner;

public class TentoTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个10进制的数：");
        int number = sc.nextInt();


        String str = "";


        while (number!=0){
            int i =number%2;
            //为什么就默认
            str= i + str;
            number =number/2;
        }

        System.out.println(str);//20-------10100

    }
}
