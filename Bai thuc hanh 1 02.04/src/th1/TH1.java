/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th1;
import java.awt.*;
import java.awt.event.*;


public class TH1 extends Frame {
    public TH1()
    {
        setTitle("Chương trình tính tổng A,B");
        setSize(200, 230);
        setLayout(new FlowLayout());
        
        lblA = new Label("a=");
        add(lblA);    // Gắn vào Frame
        
        txtA= new TextField(20);
        add(txtA);
        
        lblB = new Label("b=");
        add(lblB);    // Gắn vào Frame
        
        txtB= new TextField(20);
        add(txtB);
        //+
        btnTong = new Button("+");
        btnTong.addActionListener(new LangNgheCong());
        add(btnTong);
         //-
        btnHieu = new Button("-");
        btnHieu.addActionListener(new LangNgheTru());
        add(btnHieu);
        //*
           btnTich= new Button("*");
        btnTich.addActionListener(new LangNgheNhan());
        add(btnTich);
        // /
         btnPhan = new Button("/");
        btnPhan.addActionListener(new LangNgheChia());
        add(btnPhan);
        lblC = new Label("Kq=");
        add(lblC);    // Gắn vào Frame
       
        txtC= new TextField(20);
        add(txtC);
        xulisukien Bolangnghe = new xulisukien();
        addWindowListener(Bolangnghe);
        setVisible(true);
    }

   public static void main(String[] args) {
       new TH1();
   }
   
//--- Bộ lắng nghe
    class LangNgheCong  implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(txtA.getText());
           // Lấy B
           int b = Integer.parseInt(txtB.getText());
           //Tính tổng
           int Tong = a+b;
            // Xuất
           txtC.setText(String.valueOf(Tong));
       }
    }
     class LangNgheTru  implements ActionListener 
     {
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(txtA.getText());
           // Lấy B
           int b = Integer.parseInt(txtB.getText());
           //Tính trừ
           int Tru =a-b;
           txtC.setText(String.valueOf(Tru));
       }
     }
           //Tính tích
           class LangNgheNhan  implements ActionListener 
     {
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(txtA.getText());
           // Lấy B
           int b = Integer.parseInt(txtB.getText());
           //Tính nhan
           int Nhan =a*b;
           txtC.setText(String.valueOf(Nhan));
       }
           }
         
           //Tính chia
    class LangNgheChia  implements ActionListener 
     {
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(txtA.getText());
           // Lấy B
           int b = Integer.parseInt(txtB.getText());
           //Tính chia
           float Chia =a/b;
           txtC.setText(String.valueOf(Chia));
       }
          
       }
    
  static class xulisukien implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
        }

        @Override
        public void windowClosing(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
        }

        @Override
        public void windowIconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
        }
   
   
    Label lblA,lblB,lblC;
    TextField txtA, txtB, txtC;
    Button btnTong,btnHieu,btnTich,btnPhan; 
}
    