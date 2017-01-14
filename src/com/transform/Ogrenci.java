/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transform;

import com.factory.FactoryTime;
import java.util.Arrays;

/**
 *
 * @author ozaytunctan13
 */
public class Ogrenci {
    private String ad;
    private String soyad;
    private String cinsiyet;
    public Ogrenci(String ad, String soyad, String cinsiyet) {
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
    }
    @Override
    public String toString(){
        String m="Ogrenci Value:\n"
                +"Ad:"+this.ad+"\n"
                 +"Soyad:"+this.soyad+"\n"
                 +"Cinsiyet:"+this.cinsiyet+"\n";
        return m;
    }
    public int searcInOgrenci(Ogrenci[]ogrList,Ogrenci ogr){
        int index=-1;
        for (Ogrenci ogrenci : ogrList) {
            index++;
            if(ogrenci.ad.equals(ogr.ad) &&
               ogrenci.soyad.equals(ogr.soyad)&&
               ogrenci.cinsiyet.equals(ogr.cinsiyet)){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Ogrenci []ogr=new Ogrenci[300000];
        ogr[0]=new Ogrenci("OZAY","TUNCTAN","ERKEK");
        ogr[1]=new Ogrenci("AYŞE","TUNCTAN","BAYAN");
       
        for (int i = 2; i < 299999; i++) {
             ogr[i]=new Ogrenci("OZAY","TUNCTAN","ERKEK");
        }
        FactoryTime.tic();
         ogr[299999]=new Ogrenci("ALİ","CAN","ERKEK");
        Ogrenci clone=new Ogrenci("ALİ","CAN","ERKEK");
        int g=clone.searcInOgrenci(ogr, clone);
        System.out.println(ogr[g]);
        FactoryTime.toc();
        //System.out.println(Arrays.toString(ogr[]));
    }
}
