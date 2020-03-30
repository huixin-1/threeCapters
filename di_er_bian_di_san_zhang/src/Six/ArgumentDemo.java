package Six;

/**
 *方法参数的值是否改变：
 *    方法中的参数列表叫做形式参数，没有具体的值，只是方便的方法体中使用
 *    调用方法的时候实际传入的值叫实际参数，代表具体的数值，用来代替在方法体中代码逻辑的值进行计算
 *
 *    注意：
 *       1、形式参数的变量名称也是局部变量
 *       2、当方法的参数是基本数据类型，不会改变原来的值
 *       3、当方法的参数值是引用数据类型的时候，如果改变了引用类型的值，会改变原来的值
 *Java中的参数传递是值传递
 */

public class ArgumentDemo {
    public static void test(int a,int b) {
        int tmp =a;
        a=b;
        b=tmp;
    }



    public static void test2(Point point){
        int x = point.getX();
        int y = point.getY();
        int tmp = x;
        x=y;
        y=tmp;
        point.setX(x);
        point.setY(y);

    }


    public static void main(String[] args) {
       // int a = 10;
      //  int b = 20;
      ///  test(a,b);
       // System.out.println(a);//10
       // System.out.println(b);//20

        Point point =new Point(2,3);
        test2(point);


    }


}
