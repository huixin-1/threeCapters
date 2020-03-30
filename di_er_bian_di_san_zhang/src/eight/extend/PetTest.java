package eight.extend;
//Dog Penguin  Pet  PetTest  表示继承
//继承表示父类跟子类的关系
//当两个类或者多个类具有相同属性和方法的时候，可以提取出来变成父类，子类可以继承
//子类跟父类是is-a的关系

//使用：
// 1、继承的时候需要使用extends关键字
// 2、使用继承关系后，父类中的属性和方法都可以在子类中进行使用（非私有属性、非私有方法）
// 3、Java中是单继承的


//super： 是直接对象父类的一个引用
//用途：
//    1、 可以在子类中调用直接被父类覆盖的一个方法   super.父类方法名称
//    2、 当super在普通方法中使用的的话，可以任意位置编写
//    3、 当super在构造方法中使用的话，会调用父类的构造方法，一定要将super放在第一行
//    4、 在构造方法中super关键字和this关键字[ this() ]不能同时出现。
//    5、 父类中私有的属性和方法都不能被调用，包括构造方法
//    6、 子类的构造方法中都会默认的使用super关键字调用父类的构造方法
//    7、 如果super构造方法中显式指定了super的构造方法，那么无参构造方法就不会被调用


//总结:
//    1、在创建子类对象的时候会优先创建父类对象。
//    2、所有的Java类都具有一个老祖宗类，称之为Object，是所有类的一个跟类。
//
//
//重写：
//   必须要存在继承关系，当父类中的方法无法满足子类的需求的时候可以选择使用重写方式
//
//注意：
//  1、重写表示的是子类覆盖父类的方法，当覆盖之后，调用同样的方法的时候会优先调用子类
//  2、重写的方法名称，返回值类型，参数列表必须跟父类一致
//  3、子类重写的方法不允许比父类的方法具备更小的访问权限
//     父类    public             子类  public
//     父类    protected          子类  public protected
//     父类    default            子类  public protected  default
//     父类    private            子类  public protected  default  private  //私有是不能被继承的   所以这一行的权限是没有的
//
//   父类的静态方法子类可以被调用，但不可以被重写

public class PetTest {
    public static void main(String[] args){

    Dog dog=new Dog();
    dog.setName("大黄");
    System.out.println(dog.getName());

    dog.play();


    //继承中的主函数
    Pet pet=new Pet();
    System.out.println(pet);

    //因为主方法中已经创建了Dog dog=new Dog();所以在此不用在次创建

    System.out.println(dog);


    }
}
