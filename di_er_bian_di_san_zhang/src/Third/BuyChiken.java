package Third;
/*
百钱买百鸡
 */

public class BuyChiken {
    public static void main(String[] args) {
        for (int i = 0;i<=20;i++){
            for (int j =0;j<=34;j++){
                for (int k =0 ;k<=300;k++){
                    //&& 且
                    if (((i+k+j)==100) && ((5*i+3*j+k/3)==100)&& k%3==0){
                        System.out.println("公鸡"+i+"母鸡"+j+"小鸡"+k);

                    }
                }
            }

        }











    }
}
