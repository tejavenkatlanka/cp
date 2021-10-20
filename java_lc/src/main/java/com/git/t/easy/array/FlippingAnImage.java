package com.git.t.easy.array;

public class FlippingAnImage {

  public int[][] flipAndInvertImage(int[][] image) {

    for (int[] a : image
    ) {
      for (int i = 0; i *2 < image.length; i++) {
        if(a[i]==a[image.length-i-1]){
          a[i]=a[image.length-i-1]^=1;
        }

      }
    }

    return  image;
  }

}
