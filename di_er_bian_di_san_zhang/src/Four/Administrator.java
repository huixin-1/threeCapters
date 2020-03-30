package Four;

import java.util.Scanner;

public class Administrator {
    String loginName="admin";
    String passWord="123";
    public void introduce(){
        System.out.println(loginName);
        System.out.println(passWord);
    }

    public static void main(String[] args) {
        Administrator admin= new Administrator();
        System.out.println(admin.loginName);
        System.out.println(admin.passWord);
        admin.introduce();


        //从控制台读取数据
        Scanner sc= new Scanner(System.in);
        System.out.println("修改密码");
        System.out.println("请输入用户名信息：");
        String name = sc.nextLine();
        System.out.println("请输入密码：");
        String pwd = sc.nextLine();


        if (name.equals(admin.loginName) && pwd.equals((admin.passWord))){
            admin.loginName=sc.nextLine();
            admin.passWord=sc.nextLine();

        }
         admin.introduce();

    }

}
