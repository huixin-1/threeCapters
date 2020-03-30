package Six;
import static java.lang.Math.*;

import java.util.Date;

/**
 * import:
 * 当需要引入非lang包的其他Java累的时候，需要使用import工具
 *      如果不使用import，每次在使用某个类的时候必须将类的完全限定名加上才可以使用，太过于繁琐
 *   用法：
 *     import java.包名.类名;   导入具体的包    推荐使用
 *     import  包名 .*;       将当前下的所有类文件进行导入
 *
 *   注意：
 *      当一个Java文件中需要使用多个同名的类的时候，只能导入一个，另一个使用完全限定名的时候进行导入
 *
 *    静态导包：
 *       当需要使用某个类的多个方法的时候，同时又不想频繁写该类的名称，此时可以使用静态导包
 * */

public class ImportDemo {
    public static void main(String[] args) {
        java.util.Date date=new java.util.Date();
       // Date date1 = new Date();因为导包，所以在此正确，如果没导包，需要用上面代码
        //  java.sql.Date date2 =new java.sql.Date();
        System.out.println(Math.sqrt(2));
        System.out.println(Math.abs(-2));
        //静态导包之后
        System.out.println(sqrt(2));
        System.out.println(abs(-2));
    }


}
