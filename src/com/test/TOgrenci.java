/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.classification.Ogrenci;

/**
 *
 * @author ozaytunctan13
 */
public class TOgrenci {

    public static void main(String[] args) {
        Ogrenci ogr = new Ogrenci("ozay", "tunctan", "erkek");
        System.out.println(ogr.toString());
        Ogrenci ogr2 = ogr.clone();
        System.out.println(ogr2.toString());
        System.out.println(ogr.compareTo(ogr2));
        System.out.println(ogr.equals(ogr));
        
    }
}
