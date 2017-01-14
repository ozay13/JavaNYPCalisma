/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transform;

import java.util.Arrays;

/**
 *
 * @author ozaytunctan13
 */
public class StringIslemler {

    public static void main(String[] args) {
        String s = "ozay tunctan";
        char[] c = s.toCharArray();
        String[] elements = s.split(" ");
        int index = s.indexOf("ozay");
        boolean start = s.startsWith("ozay");
        boolean esitmi = s.equalsIgnoreCase("ozay");
        char krk = s.charAt(5);
        String ss = s.concat(" Mühendis");
        String s3 = ss.replace("ozay", "aAli");
        System.out.println(s3);
        s3.toLowerCase();
        s3.toUpperCase();
        byte[] b = s3.getBytes();
        System.out.println((int) s3.charAt(0));
        
        
       
        
        
        
    }
}
