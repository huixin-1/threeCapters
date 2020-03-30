package five;

/**
 *
 * 构造方法：
 *     创建方法的时候默认会调用构造方法来创建对象，（在队中开辟空间），可以完成某些初始化的操作
 *
 *     构造方法语法：
 *     方法名称：构造方法的方法名称必须和类名保持一致
 *     注意：
 *        1、创建完类之后，如果没有手动调用构造方法，就会有一个默认的无参构造方法供调用
 *        2、当用户自定义了构造方法之后，默认的无参构造方法就不能够使用了，必须要手动对定义无参构造方法
 *        3、同一个类中可以有多个同名的构造方法
 *    重载：在一个类中可以包含多个重名的方法，但是要注意方法的参数列表不能相同
 *        三个方面不同：
 *          参数的个数不同
 *          参数的类型不同
 *          参数的顺序不同
 *
 * */

public class Teacher {
    String name;
    int age;

    public Teacher(){

    }

    public Teacher(String xname){
        System.out.println("one argue");
        name = xname;

    }
    public Teacher(String xname,int xage){
        System.out.println("---");
        System.out.println("two argue");
        name=xname;
        age=xage;
    }

    public void teacer(){
        System.out.println("上课");

    }


    public static void main(String[] args) {
        Teacher teach=new Teacher();
        teach.age=18;
        teach.name="连";
        System.out.println(teach.name);
        Teacher teacher2=new Teacher("lisi",29);
        System.out.println(teacher2.name);
        System.out.println(teacher2.age);
        Teacher t3 =new Teacher("wangwu");
        System.out.println(t3.name);



    }

}
