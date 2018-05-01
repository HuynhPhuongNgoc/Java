/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;
import lab2.lab2_b1;
import lab2.lab2_b2;
import lab2.lab2_b3;
/**
 *
 * @author Dell
 */
public class lab2_b4 {
    public static void menu()
	{
		System.out.println("+--------------------------------+");
		System.out.println("1.giai phuong trinh bac nhat");
		System.out.println("2.giai phuong trinh bac hai");
		System.out.println("3.tinh tien dien");
		System.out.println("4.ket thuc");
		System.out.println("+--------------------------------+");
		System.out.print("chon chuc nang: ");
		Scanner scanner= new Scanner(System.in);
		byte c = scanner.nextByte();
		
		switch(c){
			case 1:
	    		lab2_b1.main(null);
	    		break; 
			case 2:
		        lab2_b2.main(null);
				break; 
			case 3:
			lab2_b3.main(null);
				break;
			case 4:
			System.exit(0);
				break;
			default : 
				System.out.print("nhap khong hop le: ");

		}
	}
	public static void main (String[] args)
	{
		menu();
	}
}
