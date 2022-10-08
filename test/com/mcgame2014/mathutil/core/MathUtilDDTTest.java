/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mcgame2014.mathutil.core;

import com.mcgame2014.mathulti.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    /**ta phai map 2 cai cot cua tung dg  vao 2 dau ? cua ham so sanh
     * 
     * Map value cua mang tu mang vao 2 bien , nhoi 2 bien nay vao ham so sanh 
    */
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20, 25};
        int b[][] = {{1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        int c[][] = {{1, 1},
        {2, 2},
        {6, 3},
        {24, 4},
        {120, 5},
        {720, 6}};
        return new Integer[][]{{1, 1},
        {2, 2},
        {6, 3},
        {24, 4},
        {120, 5},
        {720, 6}};
    }
    @Parameterized.Parameter(value = 0)
    public long expected ; //map vao cot 0 
    @Parameterized.Parameter(value = 1)
    public int n;  // map vao cot-1
    @Test
    public  void testFactirialGivenRightArgumentReturnWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
    
}
