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
public class ChatLieu {
    private String Machatlieu;
    private  String Tenchatlieu;
    public ChatLieu(String Macl, String Tencl){
        this.Machatlieu=Macl;
        this.Tenchatlieu=Tencl;
    }
    

    /**
     * @return the Machatlieu
     */
    public String getMachatlieu() {
        return Machatlieu;
    }

    /**
     * @param Machatlieu the Machatlieu to set
     */
    public void setMachatlieu(String Machatlieu) {
        this.Machatlieu = Machatlieu;
    }

    /**
     * @return the Tenchatlieu
     */
    public String getTenchatlieu() {
        return Tenchatlieu;
    }

    /**
     * @param Tenchatlieu the Tenchatlieu to set
     */
    public void setTenchatlieu(String Tenchatlieu) {
        this.Tenchatlieu = Tenchatlieu;
    }
    
}
