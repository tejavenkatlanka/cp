package com.git.t.medium.arrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxProductTest {

    @Test
    void maxProduct() {
        MaxProduct maxProduct=new MaxProduct();
        assertEquals(6,maxProduct.maxProduct(new int[]{2,3,-2,4}));
        assertEquals(0,maxProduct.maxProduct(new int[]{-2,0,-1}));
        assertEquals(24,maxProduct.maxProduct(new int[]{-2,3,-4}));
        assertEquals(2,maxProduct.maxProduct(new int[]{0,2}));


    }
}