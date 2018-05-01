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
public class lab2_b1 {
      public static void main(String[] args) {
          Scanner nhap =new Scanner(System.in);
          float a,b;
          System.out.print("Nhập a: ");
          a=nhap.nextFloat();
          System.out.print("Nhập b: ");
          b=nhap.nextFloat();
          if(a==0){
              if(b==0){System.out.print("Phương trình vô số nghiêm");}
              else 
              {System.out.print("Phương trình vô nghiệm");}
          }
          else {System.out.print("Phương trình có nghiệm "+(-b)/a);
      }
      }
}
