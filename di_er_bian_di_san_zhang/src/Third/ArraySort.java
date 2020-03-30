package Third;
/*
数组经常会用来考排序算法
     数据结构：
        线性表
        非线性表
        树
        图

     面试要求：
        1、写出某种排序算法；
           冒泡排序
           选择排序
           插入排序
           快速排序
           队列
           栈
        2、排序算法的时间复杂度（空间复杂度）
        衡量一个数据结构是否合适的衡量标准
        3、排序算法的稳定性
           排序之后的值跟排序之前的值位置是否发生变化

 */
public class ArraySort {
    public static void main(String[] args) {
        //定义数组
        int[] array = new int[]{4,1,7,2,9,3,5,8,6};
        //将数组进行排序操作，从小到大
        //冒泡排序
        for (int i =0;i<array.length;i++){
            for (int j = 0;j<array.length-1-i;j++){
                if (array[j]>array[i]){
                    int tmp =array[j];
                    array[j] = array[j+1];
                    array[j+1]=tmp;
                }
            }
        }


        for (int i =0;i<array.length;i++){
            System.out.println(array[i]+"\t");
        }



        //选择排序
        for (int i = 0;i<array.length;i++){
            for (int j = i+1;j <array.length;j++){
                if (array[i]>array[j]){
                   int tmp =array[i];
                   array[i] = array[j];
                   array[j] = tmp;

                }
            }
        }
        for (int i =0;i<array.length;i++){
            System.out.println(array[i]+"\t");
        }


    }
}
