package eight.extend;

public class Dog extends Pet {
    //公共的属性就可以不要了，我在这里注释起来
//    private String name;
//    private int age;
//    private String gender;
    private  String sound;


    public Dog(){
        System.out.println("dog 无参");

    }



    public Dog(String name,int age,String gender,String sound){
        super(name, age, gender);
        //   this.name=name;
        this.sound=sound;
        //   this.gender=gender;
        //   this.age=age;

    }




//    public int getAge(){
//           return age;
//    }

//    public void setAge(int Age){
//        this.age=age;
//    }




    public String getSound(){

        return sound;
    }

    public void setSound(String sound){

        this.sound=sound;
    }




    public void play(){
        super.play();//使用super调用方法
        System.out.println("dog is playing ball ");
    }









//    public String getGender(){
//        return gender;
//    }

//    public void setGender(String gender){
//        this.gender=gender;
//   }


//    public String getName(){
//        return name;
//    }

//    public void setName(String name){
//        this.name=name;
//    }


    public String toString(){
        //重写：因为父类中没有Sound这个属性，在父类中直接添加会报错，所以在子类中添加sound这个属性
        return super.toString()+"my sound is"+this.sound;
    }

}
