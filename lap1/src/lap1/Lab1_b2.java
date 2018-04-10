/*
Tính diện tích chu vi hình chữ nhật
 */
package lap1;

import java.util.Scanner;
public class Lab1_b2 {

    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        int a,b;
        System.out.print("Nhap chu vi" );
        a=nhap.nextInt();
        System.out.print("Nhập diện tích");
        b=nhap.nextInt();
        int cv=(a+b)*2;
        System.out.print("chu vi hinh chu nhat la: "+cv);
        int dt=a*b;
        System.out.print("Diện tích hình chữ nhật là: "+dt);
        System.out.print("Cạnh nhỏ nhất là: "+Math.min(a,b));
        
    }
    
}
