package BT2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class StudentInfo {
    private int STT; 
    private String HoTen;
    private String Gioitinh;
    private String Namsinh;
    //stt
    public int getSTT(){
        return this.STT;
    }
    public void setSTT(int STT){
        this.STT=STT;
    }
    //ho ten
    public String getHoTen(){
        return this.HoTen;
    }
    public void setHoTen(String HoTen){
        this.HoTen=HoTen;
    }
    //gioi tinh
    public String getGioitinh(){
        return this.Gioitinh;
    }
    public void setGioitinh(String Gioitinh){
         this.Gioitinh=Gioitinh;
       
    }
    //nam sinh
     public String getNamsinh(){
        return this.Namsinh;
    }
    public void setNamsinh(String Namsinh){
        this.Namsinh=Namsinh;
        
    }
}
