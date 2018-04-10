/*
Viet chuong trinh cho phep nhao ho va ten sinh vien, diem trung binh tu ban phim 
sau đo xuat ra man hinh voi dang: <<họ và tên>> <<điểm>>điểm 
 */
package lap1;

import java.util.Scanner;
public class Lap1 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print ("Họ và tên: ");
        String hoTen =scanner.nextLine();
        System.out.print("Điêm TB: ");
        double diemTB=scanner.nextDouble();
        System.out.printf("%s%f điểm",hoTen,diemTB);
                }   
}
