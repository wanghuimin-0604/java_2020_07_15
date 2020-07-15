package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //二分查找:针对一个已经排好序的数组
        int[] arr=new int[]{1,5,6,7,8,9};
        int key=9;
        System.out.println(binarySearch(arr, key));
    }

    private static int  binarySearch(int[] arr, int key) {
        //找到的话就返回这个数字/该数字的下标，找不到就返回-1
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int middle=(left+right)/2;
            if(key>arr[middle]){
                left=middle+1;
            }else if(key<arr[middle]){
                right=middle-1;
            }else{
                //说明key和middle相等
                //return arr[middle];
                return middle;


            }
        }
        return -1;
    }
}
