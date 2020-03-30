package First;/*
基本数据类型之间的转换
       自动转换
       强制转换

        注意：
           1、进行数据运算的时候必须要求数据类型一致，否则无法操作
           2、在运算过程中，如果两个值的类型不一致，会自动将小的类型转换成大的类型
           3、在运算过程中可以手动强制转换，将大的类型转换成小的类型
              实现方式，（datatype）
           4、强制类型转换，会发生精度损失，结果可能不准确
 */


public class OperatorDemo {
    public static void main(String[] args) {
       /* byte bb =10;
        int aa=20;
        byte cc;
        cc =(byte) (aa + bb);
        System.out.println(cc);*/
        byte bb =10;
        int aa=200;
        byte cc;
        cc =(byte) (aa + bb);
        System.out.println(cc);//-46
    }

}

