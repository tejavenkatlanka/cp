package com.git.t.easy.array;

public class MountainArray {

  public boolean validMountainArray(int[] arr) {
    if (arr.length < 3) {
      return false;
    }
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      if (arr[start] < arr[start + 1]) {
        start++;
      } else if (arr[end] < arr[end - 1]) {
        end--;
      } else {
        break;
      }
    }
    return start != 0 && end != arr.length - 1 && start == end;
  }

  public boolean validMountainArray1(int[] arr) {
    if (arr.length < 3) {
      return false;
    }
    int peek = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        peek++;
      } else {
        break;
      }
    }
    if (peek == 0 || peek == arr.length - 1) {
      return false;
    }
    for (int i = peek; i < arr.length - 1; i++) {
      if (arr[i] <= arr[i + 1]) {
        return false;
      }
    }
    return true;
  }
}
