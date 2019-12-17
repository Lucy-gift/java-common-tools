package com.zeroten.common.com.zeroten.common.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayUtilsTest {
    @Test
    public void testwritten(){
        Assert.assertArrayEquals(ArrayUtils.sort(new int[]{4,7,6,1}),new int[]{1,4,6,7});
        Assert.assertArrayEquals(ArrayUtils.sort(new int[] {5,9,6,3,4}),new int[]{3,4,5,6,9});
        int [] num = {5,9,10,3,2};
        System.out.println(Arrays.toString(ArrayUtils.sort(num)));
    }
}
