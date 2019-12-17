package com.zeroten.common.com.zeroten.common.util;

import org.junit.Assert;
import org.junit.Test;

public class CheckUtilsTest {

    @Test
    public void TestisAnyEmpty(){
        Assert.assertEquals(CheckUtils.isAnyEmpty("hel lo"),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(" hello"),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("hel  lo"),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("  hello"),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("hello  "),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("hello "),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("hello"),true);
    }
    @Test
    public void TestisEmpty(){
////        Assert.assertEquals(CheckUtils.isEmpty(2),false);
////        Assert.assertEquals(CheckUtils.isEmpty(((null),true);
//        Assert.assertArrayEquals(CheckUtils.isEmpty("vj "),true);
//        Assert.assertEquals(CheckUtils.isEmpty(arr:{1,"都会",null,0}),true);
//        Assert.assertEquals(CheckUtils.isEmpty(Object{1,"都会",null,0}),true);
        Assert.assertEquals(true,CheckUtils.isEmpty(new Object[]{1, "都会", null, 0}));
        Assert.assertEquals(false,CheckUtils.isEmpty(new Object[]{1, "都会"}));
        Assert.assertEquals(false,CheckUtils.isEmpty(new Object[]{1, "都会",""}));
        Assert.assertEquals(true,CheckUtils.isEmpty(new Object[]{1, "都会", null}));
        Assert.assertEquals(true,CheckUtils.isEmpty(new Object[]{1, "都会", " "}));
        Assert.assertEquals(false,CheckUtils.isEmpty(new Object[]{1, "都会",0}));


    }

    @Test
    public void testequals(){
        Assert.assertEquals(CheckUtils.equals("真","真"),true);
        Assert.assertEquals(CheckUtils.equals("真","假"),false);
        Assert.assertEquals(CheckUtils.equals("真",""),false);
        Assert.assertEquals(CheckUtils.equals("真",null),false);
    }

    @Test
    public void testintEquals(){
        Assert.assertEquals(CheckUtils.intEquals(1,2),false);
        Assert.assertEquals(CheckUtils.intEquals(1,1),true);
        Assert.assertEquals(CheckUtils.intEquals(1,null),false);
        Assert.assertEquals(CheckUtils.intEquals(null,null),false);

    }
}
