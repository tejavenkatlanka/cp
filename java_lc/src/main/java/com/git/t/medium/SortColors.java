package com.git.t.medium;

public class SortColors {
  //[2,0,1]
  public void sortColors(int[] nums) {
    if (nums.length < 2) return;
    int temp=0,low=0,mid=0,high=nums.length-1;
    while (mid <= high) {
      if(nums[mid]==0){
        temp=nums[mid];
        nums[mid]=nums[low];
        nums[low]=temp;
        low++;
        mid++;
      }
     else  if(nums[mid]==2){
        temp=nums[mid];
        nums[mid]=nums[high];
        nums[high]=temp;
        high--;

      }
      else {
        mid++;
      }

    }
  }
}
