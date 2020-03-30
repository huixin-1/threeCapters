package Second;

public class NineNineTable {
    public static void main(String[] args){
        for (int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"×"+i+"="+j*i+"\t");//制表符  也就是一个空格
            }
            System.out.println();
        }
    }
}
