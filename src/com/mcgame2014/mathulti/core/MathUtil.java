/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mcgame2014.mathulti.core;

/**
 *
 * @author Admin
 */
// Ta sẽ clone bộ thu vien/Ccong6 cụ cua Math Util cua JDK
// ggia3 lập các hàm cua class Math của JDK
// Những gì là công cụ cho hàm khác. class kahc1 thì thường sẽ dc
// thiết kế là Static
//
public class MathUtil {

    public static final double PI = 3.141592653589793;

    /**
     * hàm tính n! = 1.2.3..n Quy ước ko có giai thừa Quy Ước ko c・ giai thừa
     * trong số 穃 chỉ chấp nhận t匤h giai thừa từ 0..20
     * <0 ||> 20 chửi, đưa N c・ chớn
     */
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("them so sai n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    /**
     * ki thuat lap trinh kieu moi (van giu nguyen nhung kien thuc lap trinh da
     * co) 1 plugin moi cho trinh do dev - viet code chat luong ko noi = mieng ,
     * chat luong noi = code ki thuat tdd- test driven develoment
     *
     */

}
