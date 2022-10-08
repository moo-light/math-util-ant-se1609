/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mcgame2014.mathutil.core;

import com.mcgame2014.mathulti.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
    //TDD Test Driven Developer
    //DDT Datr Driven Testing

    //class nay ta se viet cac doan code nhu binh thuong 
    // nhung code nay dung de test cac code chinh ben math util
    //viet code de test code chinh thi cai code test nay dc goi la 
    // ten test script
    // test script la nhung doan code dc viet ra de test code khac , code chinh
    // nhung doan code nay duoc goi cac ham ben code chinh , so sanh gia tri
    // tra ve se co gia tri nhu ky vong
    // ben trong 
//    test script chua cac test case
    //trang test script/CLass nay se co test 5! 6! 7! -> test case
    //ten ham test bao ham luon y nghia test cai gi
    //quy uoc kiem thu
    //  ham nay muon test cai ham giai thua khi dua tham so dung
    // viet code phai tho quy tac - Coding Convention
    // hàm getF trả về 1 con long nếu n đưa vào 0..20
    //ham GetF() hàm getF ném ra exception nếu ta đủa vào N<0 N>20
    //dua ra nhan ngoai le
    // bat xem ham minh co dung voi ngoai le hay khong neu data ca chon
    //thay ngoai le Mung roi nuoc mat
    @Test
    // Khi chạy hàm nay kiểm tra giùm xem có 1 ngoại lệ thuộc nhóm IllegalArgumentException xuất hiện hay k
    // Kì vọng xuất hiện dùngoai5 lệ
    public void testFactorialGivenWrongArgumentThrowsException() {
        Class<?> expected = Exception.class;
    }

    @Test

    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case so 1 kiem thu tinh huong 0!
        // n=0 -> exected = 1
        // actual thuc te ham chay tra ra may ai ma biet
        //
        long expectec = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expectec, actual);
        //so sanh 2 gia tri coi tuong dong ko 
        // sosanh bang sout va dung mat de luan ket qua 
        //  choi màu moi ngau
        //testcase 2 
        // n=1 -> exected = 1
        // actual thuc te ham chay tra ra may ai ma biet
        expectec = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expectec, actual);
        //testcase 3 
        // n=2  2!-> expected = 2
        // actual thuc te ham chay tra ra may ai ma biet
        expectec = 2;
        actual = MathUtil.getFactorial(2);
        Assert.assertEquals(expectec, actual);

    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
        //Test case so 4 kiem thu tinh huong 0!
        // n=3 -> exected = 6
        long expectec = 6;
        long actual = MathUtil.getFactorial(3);
        Assert.assertEquals(expectec, actual);
        //so sanh 2 gia tri coi tuong dong ko 
        // sosanh bang sout va dung mat de luan ket qua 
        //  choi màu moi ngau
        //testcase 5
        // n=4 -> exected = 24
        // actual thuc te ham chay tra ra may ai ma biet
        expectec = 24;
        actual = MathUtil.getFactorial(4);
        Assert.assertEquals(expectec, actual);
        //testcase 6 
        // n=5  5!-> expected = 120
        // actual thuc te ham chay tra ra may ai ma biet
        expectec = 120;
        actual = MathUtil.getFactorial(5);
        Assert.assertEquals(expectec, actual);
        //testcase 7 
        // n=6  6!-> expected = 720
        // actual thuc te ham chay tra ra may ai ma biet
        expectec = 720;
        actual = MathUtil.getFactorial(6);
        Assert.assertEquals(expectec, actual);

    }

    //@Test được gọi là anotation đễ dánh dấu doan code mang 1 ys nghia nao do
    //khi bien dich code thi cac thu vien di kem no se tu dong generate the code cho minh tuỳ theo @
    // Vis dụ @Test thi thu vien JUnit nó sẽ tự ngam generate
    // pubic static void main va gui ham main nay cho JVM
    // ky thuat giong thu vien,  bi ep phai theo cu phap cua no qua nhung
    // @ , nay goi la FrameWork
    // framework la thu vien nhung thu vien ko phai la framework
    // framework se kiem soat code cua minh
    // framework dung anotation con library thi khong
    // FW la nhung file .jar .dll chua 1 dong class ben trong do
    // ep ta phaxai theo cach cua no, theo dan khung code quy uoc
    // Thu ven Library, nhung file .jar .dll chua 1 dong class ben trong 
    // ep ta phai xai theo cach cua no theo dan khung ma code quy uoc
    // dan khung, code template, 
    @Test
    public void tryJUNITFirst() {
//        Assert.assertEquals(69, 70);
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }
    //Quy Tac choi xanh do 
    // Xanh khi tat ca cac test case deu xanh
    //      Expected == actual, ko ngoai le
    // Do chi can co 1 test case mau do (expected != actual)
    // xem nhu ham tach
    // 1 Thang gây sai cho tất cả
    // chỉ cân 2co1 1 sự ko == nhau cua actual , expected 
    // - > ham ko ổn định về kết quả

    /* KO Thể test hết các case nhưng đã test casenao2 thì ngon case đó
       MÀU ĐỎ: Xảy ra khi có sự ko bằng nhau của texpected vaf actual
       có 2 lí do
        Expected đúng Actual Sai --> BUG
        Expected Sai Actual Đúng --> kỳ công sai thì hy cọng gì ở actual
     */
    /**
     * DDT Tach bo data kiem thu ra 1 cho lat hoi nhoi laidata nay tuan tu vao
     * kiem thu V・ du t當h data o tren kiemt hu ở tr麩 thanh      *
     * 1    0
     * 1    1
     * 2    2
     * 3    6
     * thay vi lenh goi viet tung case
     * ta bien ệnh n炸 th瀟h data cụ thể 
     * tro thanh tog quat dien data cu the
     * 
     * Assert.assertEquals(???, MathUtil.getFactorial(???));
     * 
     * ??? nay se lay tu data o tren 
     * code gon hon dep hon de bao tri hon kiem soat cho du thieu cac case 
     * ki thuat tach code test ra khoi data cua no lat hoi fill lai sau
     * dc goi la ki thuat viet case theo kieu tham so hoa
     *                                  PARAMETER 
     * 
     * hoac con dc goi la DDT - Data driven testing
     * Viet kiem thu huong ve tach data rieng ra!!!
     * 
     */
}
