package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-15
 * Time:12:51
 * 一万年太久，只争朝夕，加油
 */

import java.util.Arrays;

/**
 * 冒泡排序的思想：
 *   外层循环控制趟数
 *   内层循环控制每趟要比较的次数
 *   要找到趟数和每趟比较次数之间的联系
 *        i个数字要比i-1趟
 *        第i趟要比arr.length-i-1趟
 */


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{2,1,3,6,5,4,8,7,9,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));



    }
//从小到大排序
    private static void bubbleSort(int[] arr) {
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            //flag=false;
            for(int j=0;j<arr.length-1-i;j++){
                //稳定排序，相等的时候不进行交换
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    //flag=true;

                }
            }
            /*if(false==false){
                return;
            }*/
        }
    }
}
