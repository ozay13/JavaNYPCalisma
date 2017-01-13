/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import javax.swing.JOptionPane;

/**
 *
 * @author ozaytunctan13
 */
interface Message{
    public void  showMessage(String message ,MSNType t);
}
public class MSN implements Message{
    @Override
    public  void showMessage(String message,MSNType t) {
       if(t==MSNType.Image){
           //loadImage
            JOptionPane.showConfirmDialog(null,"Images "+message);
       }
       if(t==MSNType.Video){
           JOptionPane.showConfirmDialog(null,"Videos "+message);
       }
       if(t==MSNType.MIME){
           JOptionPane.showConfirmDialog(null,"MIME "+message);
       } 
    }
    
}
enum MSNType{
    MIME(1),Video(2),Image(3);
    private int index;

    private MSNType(int index) {
        this.index = index;
    }
    
}
class test{
    public static void main(String[] args) {
        MSN m=new MSN();
          m.showMessage("HELLO TAYI", MSNType.MIME);
    }
}