package five;
/**
 * 变量：
 *   局部变量：
 *      定义在方法中的变量称之为局部变量
 *         作用域：从定义位置开始到整个方法结束
 *         局部变量不包含默认值，如果没有使用当前变量的话，可以不赋值
 *         注意：局部变量只能在当前方法中使用，其它地方无发使用
 *
 *   成员变量：
 *   当以在方法外类内的变量（全局表变量）
 *         成员变量包含初始值：   int  0   String  null   boolean  false
 *
 *         作用域：整个类体
 *
 *
 *
 *   成员变量
 *
 *
 *
 * */

public class VarDemo {
    static int age =20;
    public void show(){
        //局部变量
        int a;
        String name ="zhangsan ";
        System.out.println(age);//20
        System.out.println();


    }


    public void test(){
        System.out.println(age);//20
        age=10;
        System.out.println(age);//10
        int age = 30;//new  了一个新的age
        System.out.println(age);//30

    }

    public static void main(String[] args) {
        System.out.println(age);//20
        new VarDemo().test();
        System.out.println(age);//10
    }





}
