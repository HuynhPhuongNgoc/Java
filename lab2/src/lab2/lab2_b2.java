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
public class lab2_b2 {
    public static void main(String[]args){
      Scanner nhap=new Scanner(System.in);
        double a,b,c;
      System.out.print("Nhập a: ");
        a=nhap.nextDouble();
      System.out.print("Nhập b: ");
        b=nhap.nextDouble();
      System.out.print("Nhập c: ");
        c=nhap.nextDouble();
        
        if(a==0)
        {
            if(b==0)
            {
                if(c==0)
                 {
                      System.out.print("Phương trình vô số nghiêm");
                 }
                else 
                  {
                      System.out.print("Phương trình vô nghiệm");
                  }
            }
            else 
            {     
                System.out.print("Phương trình có nghiệm: "+(-c)/b);
            }
        }
        else
        {
           float delta=(float) (Math.pow(b,2)- 4*a*c);
           if(delta<0)
           
           {
               System.out.print("Phương trình vô nghiệm");
           }
           
           if(delta==0)
           
           {
               System.out.print("Phương trình có nghiệm kép x="+(-b)/(2*a));
           }
           
           if(delta>0)
           { 
           float x1= (float)((-b)+Math.sqrt(delta)/(2*a));
           float x2= (float) ((-b)-Math.sqrt(delta)/(2*a));
            System.out.printf("Phương trình có 2 nghiệm phân biệt: %f %f ",x1,x2 );  
           }
        }
    }
}
  

