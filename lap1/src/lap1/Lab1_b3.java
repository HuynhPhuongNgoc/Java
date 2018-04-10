/*
 tính thể tich khoois lập phương
*/
package lap1;
import java.util.Scanner;
public class Lab1_b3 {

    public static void main(String[] args) {
      Scanner Nhap=new Scanner(System.in);
      int c;
      System.out.print("Nhập cạnh lập phương: ");
      c=Nhap.nextInt();
      System.out.print("Thể tích hình lập phương =: "+Math.pow(c,3));
    }
    
}
