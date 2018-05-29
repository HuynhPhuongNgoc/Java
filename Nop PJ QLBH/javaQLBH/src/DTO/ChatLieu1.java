/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Dell
 */
public class ChatLieu1 {
     private String MaChatLieu;
    private  String TenChatLieu;
    public ChatLieu1(String Macl, String Tencl){
        this.MaChatLieu=Macl;
        this.TenChatLieu=Tencl;
    }

    /**
     * @return the MaChatLieu
     */
    public String getMaChatLieu() {
        return MaChatLieu;
    }

    /**
     * @param MaChatLieu the MaChatLieu to set
     */
    public void setMaChatLieu(String MaChatLieu) {
        this.MaChatLieu = MaChatLieu;
    }

    /**
     * @return the TenChatLieu
     */
    public String getTenChatLieu() {
        return TenChatLieu;
    }

    /**
     * @param TenChatLieu the TenChatLieu to set
     */
    public void setTenChatLieu(String TenChatLieu) {
        this.TenChatLieu = TenChatLieu;
    }
    

    /**
     * @return the Machatlieu
     */
  
}
