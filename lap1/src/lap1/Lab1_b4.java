/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap1;

import java.util.Scanner;
public class Lab1_b4 {

    public static void main(String[] args) {
        Scanner banphim= new Scanner(System.in);
        int a,b,c;
        System.out.print("nhập a: ");
        a=banphim.nextInt();
        System.out.print("Nhập b: ");
        b=banphim.nextInt();
        System.out.print("Nhập c: ");
        c=banphim.nextInt();
        
                System.out.print("Delta là: "+(Math.pow(b,2)- 4*a*c));
    }
    
}