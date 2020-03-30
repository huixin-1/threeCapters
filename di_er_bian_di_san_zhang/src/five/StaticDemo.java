package five;
/**
 *  static:
 *  修饰成员变量的时候，表示静态成员表变量或者叫类变量
 *           普通变量在使用的时候，必须通过对象名进行调用；：
 *           类变量或者静态变量可以使用对象名调用，也可以使用类名进行调用
 *       修饰方法的时候，表示静态方法或者叫类方法
 *       注意：
 *        1、 静态变量，在创建对象之前被初始化，或者说类在载入之前进行初始化
 *        2、 静态变量被所有的对象所共享，属于公共变量 ，对象和类都可以直接调用
 *        3、 成员变量放在堆中，而静态变量放在方法区中静态区；
 *        4、静态变量不能定义在静态方法中
 *        5、静态方法可以在非静态方法中进行调用
 *        6、静态方法中不能调用非静态方法
 *        7、静态方法中不允许this调用般
 *        8、一般工具类中的方法定义为static
 *
 *
 *
 */


public class StaticDemo {
    String name="zhangsan";
    static int age=10;


    public static void test(){
        System.out.println("static");

    }


    public void test2(){
        test();

    }

    public static void main(String[] args){
        StaticDemo staticDemo=new StaticDemo();
        //使用对象进行调用
        System.out.println(staticDemo.name);
        System.out.println(staticDemo.age);
        //使用类名进行调用
        //System.out.println(StaticDemo.name);
        //System.out.println(StaticDemo.age);

        staticDemo.age=20;
        System.out.println(staticDemo.age);
        System.out.println(StaticDemo.age);

        staticDemo.age=30;
        System.out.println(staticDemo.age);
        System.out.println(StaticDemo.age);

        StaticDemo staticDemo1=new StaticDemo();
        System.out.println(staticDemo1.age);

    }
}
