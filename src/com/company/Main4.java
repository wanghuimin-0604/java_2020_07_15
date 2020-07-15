package com.company;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-15
 * Time:14:53
 * 一万年太久，只争朝夕，加油
 */
//在数组中，将偶数放在奇数之前
public class Main4 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        transform(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void transform(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while((left<right)&&arr[left]%2==0){
                left++;
            }
            while((left<right)&&arr[right]%2==1){
                right--;
            }
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

        }
    }
}
