/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COMMON;
import BLL.*;
import DAL.*;
import java.util.ArrayList;
import DTO.*;
import java.sql.SQLException;
/**
 *
 * @author Dell
 */
public class TEST {
    public static ArrayList<Hang1> hang = Hang1Form.HangArray();
    public static void main(String[] args) {
       for(int i = 0 ; i < hang.size(); i++ ){
           System.out.println(hang.get(i).getMaHang()+"\n");
       }
    }
    
}
