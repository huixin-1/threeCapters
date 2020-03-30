package First;/*
分支结构：
    单分支结构：只做一条判断，如果符合去做某些事情
    双分支结构：当做条件判断的时候，只做两种选择
    多分支结构：可以进行多个条件的判断，每个匹配项可以执行不同的结果
    嵌套分支结构：
switch:多分支结构，一般用于等值判断
 */


import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {

        //单分支判断；Math.random()产生数据的范围是[0,1)

        //得到0~5之间的随机数
       /* int i =(int)(Math.random()*6);
        if (i>3){
            System.out.println("值大于3");
        }
        System.out.println("number:"+i);
*/


        /*
        double ii =6*Math.random();
        double j =6*Math.random();
        double k =6*Math.random();
        int count = (int)(ii+j+k);

        if(count > 15){
            System.out.println("今天手气不错");
        }
        if(count>=10&&count<=15){
            System.out.println("今天手气很一般");

        }
        if (count<10){
            System.out.println("今天手气不怎莫样");

        }
        System.out.println("得了"+count+"分");

*/
        //双分支结构
   /*     int r =1;
        double PI =3.14;
        double area =PI *r*r;
        double length = 2 *PI*r;

        if (area >= length){
            System.out.println("面积大于周长");

        }else{
            System.out.println("周长大于面积");
        }
*/


        //scanner
        //创建文件扫描器对象，System.in表示的是标准输入，可以从控制台读取数据（装饰着模式）
       /* Scanner sc= new Scanner(System.in);
        System.out.println("请输入数据");
        String str=sc.nextLine();
        System.out.println(str);

*/

        //多分支结构
       /* int age =(int)(Math.random()*100);
        if (age<10){
            System.out.println("儿童");
        }else if (age < 20){
            System.out.println("少年");
        }else if (age < 20){
            System.out.println("青年");
        }else if (age < 20){
            System.out.println("中年");
        }else if (age < 20){
            System.out.println("老年");
        }else {
            System.out.println("碟得");

        }
*/





       //嵌套分支结构
       /* int time =(int)(Math.random()*40);
        if (time <20){
            System.out.println("恭喜进入决赛");
            String sex = ((int)(Math.random()*2))==0?"girl":"boy";
            if (sex =="girl"){
                System.out.println("欢迎进入女子组");
            }else {
                System.out.println("欢迎进入男子组");

            }
        }else{
            System.out.println("英语成绩太差被淘汰");
        }*/

      //switch多分支结构
        /*注意：
        1、每个case模块中需要添加break，防止多次匹配
        2、如果多个case中处理的逻辑代码块一致，可以考虑只在最后添加一次处理
        3、default表示默认选项，当所有case不匹配的时候，会执行此选项
        4、defult也可以有也可以没有

         */
  /* int random = (int)(Math.random()*26);
   char ch = (char)('a'+random);
   switch (ch){
       case 'a':
           System.out.println("元音"+ch);
           break;
       case 'e':
           System.out.println("元音"+ch);
           break;
       case 'i':
           System.out.println("元音"+ch);
           break;
       case 'o':
           System.out.println("元音"+ch);
           break;
       case 'u':
           System.out.println("元音"+ch);
           break;
       case 'y':
           System.out.println("半元音"+ch);
           break;
       case 'w':
           System.out.println("半元音"+ch);
           break;
       default:
        System.out.println("辅音："+ ch);


   }*/
        int random = (int)(Math.random()*26);
        char ch = (char)('a'+random);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音"+ch);
                break;
            case 'y':
            case 'w':
                System.out.println("半元音"+ch);
                break;
            default:
                System.out.println("辅音："+ ch);


        }


   }






}
