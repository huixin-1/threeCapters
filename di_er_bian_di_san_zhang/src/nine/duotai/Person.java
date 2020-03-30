package nine.duotai;

/**
 * 多态：
 *    对应同一个指令（调用同一个名称的方法），不同的对象给予不同的反应（不同的方法实现）
 *
 * 规范（多态实现的前提）
 *       1、必须要有继承关系；
 *       2、子类方法必须重写父类的方法
 *       3、父类引用指向子类对象
 *多态的目的：
 *    为了提高代码的扩展性和维护行
 *    方便代码逻辑的编写
 * 多态的两种表现形式：
 *    1、父类作为方法的参数
 *    2、父类作为方法的返回值类型
 */


public class Person {
 /*
    public void feed(){
        new Dog().feed();//狗在吃骨头
        new Cat().feed();//猫在吃鱼
    }

    public static void main(String[] args) {
        Person p=new Person();
        p.feed();
    }
*/

/*



 //这两个方法能否合并成一个方法
    public void feed(Cat cat){
        cat.feed();
    }
    public void feed(Dog dog){
        dog.feed();
    }

    public static void main(String[] args) {
        Person p=new Person();
        Dog dog=new Dog();
        Cat cat=new Cat();
        p.feed(dog);//狗在吃骨头
        p.feed(cat);//猫在吃鱼
    }

 */
//这种方法的实现，就可以称之为多态
    public void feed(Pet pet){
        pet.feed();
    }

    public static void main(String[] args) {
        Person p=new Person();
        Pet dog=new Dog();
        Pet penguin = new Penguin();
        Pet cat=new Cat();
        p.feed(dog);//狗在吃骨头
        p.feed(cat);//猫在吃鱼
        p.feed(penguin);

    }

}
