package com.mycompany.myfirstapp.test;

import android.test.InstrumentationTestCase;

/**
 * Created by hanqing on 2015/3/13.
 */
public class ExampleTest2 extends InstrumentationTestCase {
    public void test2() throws Exception {
        final int expected = 1;
        final int reality = 1;
        assertEquals(expected, reality);
    }
}
