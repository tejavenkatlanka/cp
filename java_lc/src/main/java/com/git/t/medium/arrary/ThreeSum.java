package com.git.t.medium.arrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ThreeSum {

  public List<List<Integer>> threeSum(int[] num) {
    List<List<Integer>> res = new LinkedList<>();
    Arrays.sort(num);
    for(int i=0;i<num.length-2 && num[i]<1;i++){
      int lo=i+1,hi=num.length-1,sum=0-num[i];
      while(lo<hi){
        if(num[lo]+num[hi]==sum){
          res.add(Arrays.asList(num[lo],num[hi],num[i]));
          while(lo<hi && num[lo]==num[lo+1]) lo++;
          while(lo<hi && num[hi]==num[hi-1]) hi--;
          lo++;
          hi--;
        }
        else if(num[lo]+num[hi]<sum){
          while(lo<hi && num[lo]==num[lo+1]) lo++;
          lo++;
        }
        else{
          while(lo<hi && num[hi]==num[hi-1]) hi--;

          hi--;
        }

      }


      while (i+1 < num.length && num[i+1] == num[i]) i++;


    }
    return res;
  }

  public List<List<Integer>> threeSum1(int[] nums) {

    Set<List<Integer>> res = new HashSet<>();
    if (nums.length == 0) {
      return new ArrayList<>(res);
    }

    Arrays.sort(nums);
    int max = nums.length - 2;
    for (int i = 0; i < max && nums[i] > 0; i++) {
      int j = i + 1;
      int k = nums.length - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == 0) {
          res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
        } else if (sum > 0) {
          k--;
        } else {
          j++;
        }
      }

    }
    return new ArrayList<>(res);
  }

}
