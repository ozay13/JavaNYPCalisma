/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classification;

import java.util.Arrays;

/**
 *
 * @author ozaytunctan13
 */
public class TValueGet {
  private int session_id=0001;
  private String numbers="10101010";
  private int[]session={1,2,3,4,5,6};
    public int getSession_id() {
        return session_id;
    }

    public String getNumbers() {
        return numbers;
    }

    public int[] getSession() {
        return this.session.clone();
    }
    public String toString(){
        String s="TValue:\n"+
                "session_id:"+this.session_id+
                "\n numbers:"+this.numbers+
                "\nsessions:"+Arrays.toString(this.getSession().clone());
        return s;
                
        
    }
}
