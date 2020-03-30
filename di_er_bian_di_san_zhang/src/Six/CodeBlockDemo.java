package Six;
/**
 * 分类：
 * 普通代码块：定义在方法中，使用{}括起来的代码叫做普通代码块
 * 构造代码块：定义在类中使用{}括起来的代码叫做构造代码块
 *      注意：每次代码运行的时候会将构造代码块中的代码添加到构造方法前面
 *         构造代码块中的代码会添加到每一个构造方法中，当使用this（参数）的时候不会添加

 * 静态代码块：优先使用static{}括起来的代码叫做静态代码块，在程序载入的时侯优先执行
 *         数据库连接其他提前需要准备好的代码块会放在static代码块中
 * 同步代码块：
 *        在多线程的时候会使用，用来给共享空间进行枷锁操作（）
 *     执行顺序 ：静态代码块>构造代码块（创建对象的时候才会使用）>普通代码块>
 *
 *
 *
 * */

public class CodeBlockDemo {
    int a;
    int b;

    static{
        System.out.println("静态代码块");
    }



    public CodeBlockDemo(){
        System.out.println("无参代码块");
        System.out.println("构造方法");
    }



    public CodeBlockDemo(int a){
        this.a=a;
    }




    public CodeBlockDemo(int a,int b){
        this(a);
        this.b=b;
    }




    {
        System.out.println("构造代码块");
    }



    public void test(){
        System.out.println("test");
        {
            System.out.println("我应该是什么分类");
        }
    }



    public static void main(String[] args){
        CodeBlockDemo codeBlockdemo=new CodeBlockDemo();//传不同的参数，调用不同的方法
        codeBlockdemo.test();
        {
            System.out.println("main");
        }
    }
}
