package Six;


/*
* 定义类的时候需要包含一下组件：
*      私有属性
*      构造方法
*      set/get方法
*      普通方法

* */

public class Dog {
    String name;
    private int age;
    String color;

    public Dog(){

    }

    public Dog(String name,int age,String color){
        this.age=age;
        this.color=color;
        this.name=name;

    }

    public void setAge(int age){
        if (age>0){
            this.age=age;
        }else {
            System.out.println("输入年龄不规范，重新输入");
        }


    }




    public void eat(){
        System.out.println("eating 骨头");
    }


    public void play(){
        System.out.println("playing......");
    }


    public void show(){
        System.out.println("name:"+this.name);
        System.out.println("age:"+this.age);
        System.out.println("color:"+this.color);


    }


}
