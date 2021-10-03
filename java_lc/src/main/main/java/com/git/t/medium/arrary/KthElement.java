package com.git.t.medium.arrary;

public class KthElement {

  public int findKthLargest(int[] nums, int k) {
    return quickSelect(nums, 0, nums.length - 1, k);
  }

  private int quickSelect(int[] nums, int lo, int hi, int k) {
    int pivot = lo;
    for (int i = lo; i < hi; i++) {
      if (nums[i] <= nums[hi]) {
        swap(nums, pivot++, i);
      }
    }
    swap(nums, pivot, hi);
    int count = hi - pivot + 1;
    if (count == k) {
      return nums[pivot];
    }
    if (count > k) {
      return quickSelect(nums, pivot + 1, hi, k);
    }
    return quickSelect(nums, lo, pivot - 1, k - count);
  }

  private void swap(int[] nums, int i, int i1) {
    int tem = nums[i];
    nums[i] = nums[i1];
    nums[i1] = tem;
  }

  public int findKthLargest1(int[] nums, int k) {
    return quickSort(nums, 0, nums.length - 1, k - 1);
  }

  public int quickSort(int[] a, int low, int high, int k) {
    if (low >= high) {
      return a[low];
    }
    int i = low - 1, j = high + 1;
    int x = a[i + j >> 1];
    while (i < j) {
      do {
        i++;
      } while (a[i] > x);
      do {
        j--;
      } while (a[j] < x);
      if (i < j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
    }

    if (k <= j) {
      return quickSort(a, low, j, k);
    } else {
      return quickSort(a, j + 1, high, k);
    }

  }
}
