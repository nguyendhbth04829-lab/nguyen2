package vn.fpoly.sof3041_sp26_sd22141.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Myutil2Test {
    Myutil2 myUtil2;
    @BeforeEach
    void setUp(){
myUtil2 = new Myutil2();
    }

    @Test
    void testSumNormal(){
        int [] arr={1,3,6};
  assertEquals(10,myUtil2.sum(arr));
    }

    @Test
     void testSumEmpty(){
        int []arr={};
        assertEquals(0,myUtil2.sum(arr));
    }

    @Test
    void testSumNegative(){
        int [] arr={1,-1};
        assertEquals(0,myUtil2.sum(arr));
    }
}
