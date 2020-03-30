package nine;

public class Student {
    private String name;
    private int age;


    public Student(String name,int age){
        this.name=name;
        this.age=age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1 =new Student("zhangsan",12);
        Student s2=s1;
        s2.setName("lisi");
        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true

    }


}
