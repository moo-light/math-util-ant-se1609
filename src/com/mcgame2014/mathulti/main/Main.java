/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mcgame2014.mathulti.main;

import com.mcgame2014.mathulti.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("This message came from ");
        tryTDDFirst();
    }

    /*
    Test case 1 t・h hống x瀛 h瀘 số 1
    n=0 
     */
    public static void tryTDDFirst() {
        long expected = 0;
        long actual = MathUtil.getFactorial(0);
        System.out.println("0! Status | Expected = " + expected + "| Actual= " + actual);

        expected = 1;
        actual = MathUtil.getFactorial(1);
        System.out.println("1! Status | Expected = " + expected + "| Actual= " + actual);
        //Test case #3
        expected = 2;
        actual = MathUtil.getFactorial(2);
        System.out.println("2! Status | Expected = " + expected + "| Actual= " + actual);
        //Test case #4
        expected = 120;
        actual = MathUtil.getFactorial(5);
        System.out.println("5! Status | Expected = " + expected + "| Actual= " + actual);
        //so s疣h 2 gi・ trị dể bết h瀘 vết đ佖g hay k
        //3 thứ n炸 tổ hợp n麩 1 thứ gọi l・ test case
        //Viet sub 1 giai thua co bang 1 khong
    }
}
