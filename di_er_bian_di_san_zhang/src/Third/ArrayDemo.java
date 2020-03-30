package Third;
/*
数组表示存储相同数据类型数据的有序集合
   特点：
      1、数组中存放的数据必须是同一个数据类型，可以实基本数据类型；也可以是引用数据类型
      2、数组在定义的时候必须给定大小，且大小不可以改变
      3、可以通过下标值来获取数据，下标从0开始
      4、插入数组中的数据是有序的集合，此时有序并不指代大小排序，而是指插入顺序

    使用：
      1、声明数组；
      2、创建空间；
      3、赋值；
      4、数组操作

 */

public class ArrayDemo {
    public static void main(String[] args) {
        //声明数组
        int[]array;
        //创建内存空间
        array =new int[5];
        //数组声明赋值
        array[0]=0;
        array[1]=1;
        array[2]=2;
        array[3]=3;
        array[4]=4;
        //array[5]=0;//有他就会出错，因为超出数组空间
        //数组操作
        System.out.println(array[2]);//2


        //数组几种创建方式
        //1、声明并申请空间  []的位置是任意的
        int[] arr1 =new int[5];
        int [] arr4 =new int[5];
        int arr3[]  =new int[5];
        //2、声明数组并赋值
        int[] arr2 =new int[]{1,2,3,4,5};
        //3、直接初始化操作
        int [] arr5 ={1,2,3};

        //获取数组的长度
        System.out.println(arr5.length);//3
        System.out.println(arr1.length);//声明数组不赋值是会占用空间的  5

        //输入5个数值并求平均值
        int[] arr6 = new int[]{23,54,65,77,124};
        int sum = 0;
        for (int i =0;i<arr6.length;i++){
            sum+=arr6[i];

        }
        System.out.println("平均值是"+sum/arr6.length);//平均值是68

    /*
    数组是引用数据类型，当创建完成数组之后相当于在方法外定义了一个变量，此时，数组中的只是有默认值的
    默认值是什莫；取决于你默认数组的类型
    int：0；
    String：null
    boolean ：false
    数组可以根据下标获取值

     */
    int[] array9 =new int[5];
        System.out.println(array9[0]);//0


    }
}
