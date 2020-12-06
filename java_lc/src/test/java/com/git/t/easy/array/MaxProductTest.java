package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxProductTest {

  @Test
  void maximumProduct() {
    MaxProduct maxProduct=new MaxProduct();
    assertEquals(6,maxProduct.maximumProduct(new int[]{1,2,3}));
    assertEquals(24,maxProduct.maximumProduct(new int[]{1,2,3,4}));
    assertEquals( -6,maxProduct.maximumProduct(new int[]{-1,-2,-3}));
    assertEquals( 39200,maxProduct.maximumProduct(new int[]{-100,-98,-1,2,3,4}));


  }
}