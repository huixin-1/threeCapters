package eight.extend;

public class Pet {
    private String name;
    private int age;
    private String gender;

    String abc;


    public Pet(){
        System.out.println("pet 无参");
    }



    public Pet(String name,int age,String gender){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }



    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }


    public int getAge(){
        return age;
    }

    public void setAge(int Age){
        this.age=age;
    }





    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender=gender;
    }
    //  如果在此打上一个@Override   会报错
    public void play(){
        System.out.println("play~~~~~");
    }

    //继承  方法
    @Override
    public String toString(){
        return "my name is"+this.name+",my age is"+this.age+"my gender is"+this.gender;
    }

}
