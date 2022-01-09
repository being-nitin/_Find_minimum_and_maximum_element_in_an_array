package com.Recursion;
public class Main {

    public static void main(String[] args) {
	// Find minimum and maximum element in an array
        int[] nums = {8,5,3,4,2,1};
        sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        System.out.println("The maximum and minimum value in an array are "+max+" , "+min);
    }
    public static void sort(int[] nums){
        for(int i=0;i< nums.length;i++){
            for(int j=1;j< nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }
            }
        }
    }
    public static void swap(int[] nums,int first,int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
// using bubble sort, sorted the array