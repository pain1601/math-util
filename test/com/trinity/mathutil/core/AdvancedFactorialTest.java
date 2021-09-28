package com.trinity.mathutil.core;

import static com.trinity.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    @Parameters
    public static Object[][] initData() {
        return new Integer[][] {
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120}
                               };
    }
    
    @Parameter(value = 0)
    public  int input;
    
    @Parameter(value = 1)
    public long expected;
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, getFactorial(input));
    }
}
