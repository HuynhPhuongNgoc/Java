/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class lab2_b3 {
    public static void main (String[]args){
        double soDien, tien;
        Scanner nhap= new Scanner(System.in);
        System.out.print("Nhập số điện: ");
        soDien=nhap.nextDouble();
    if(soDien<50)
        tien=soDien*1000;
    else
       tien=50*1000+(soDien-50)*1200; 
       System.out.print("Tổng số tiền điện của tháng: "+tien);
}
}
