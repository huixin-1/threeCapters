package Second;
/*
生成0~100的随机数；直到生成88为止；
 */
public class BreakDemo {
    public static void main(String[] args) {

        int count=0;
        while (true){
            int i =(int)(Math.random()*101);
            if (i==88){
                System.out.println(i);
                break;

            }
            count++;
            System.out.println(count+"--"+i);

        }

    }
}
