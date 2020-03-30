package Second;
/*
循环结构
1、while
需要四部分组成：
初始化：变量的初始化
条件判断：必须要返回true或者false的值
循环体：具体要执行的逻辑代码
迭代变量：促使次循环结束
2、do while 先执行代码逻辑

 */
public class WhileDemo {
    public static void main(String[] args) {

        /*while循环样例
         int i = 1;
        while(i<100){
            System.out.println("第"+i+"遍输出");
            i++;
        }
        */
        //求100以内的偶数和
        int i=1;
        //求和最终存储变量
        int sum = 0;
        while (i<=100){
            if (i%2==0){
            sum+=i;
            }
            i++;

        }
        System.out.println("100以内的偶数和是："+sum);


        //do while
        int i1=1;
        do {
            System.out.println("第"+i1+"遍输出");//输出到100
            i++;
        }while (i<=100);



    }
}
