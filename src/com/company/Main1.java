package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-15
 * Time:12:45
 * 一万年太久，只争朝夕，加油
 */
//打擂台的方式求最大值
public class Main1 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,4,2,3,8,5,6,7};
        System.out.println(findMax(arr));

    }

    private static int findMax(int[] arr) {
        //打擂台
        int max=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(max<arr[i+1]){

                max=arr[i+1];
           }
        }
        return max;
    }
}
