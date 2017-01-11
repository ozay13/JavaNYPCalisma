/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.classification.TValueGet;

/**
 *
 * @author ozaytunctan13
 */
public class TGetter {

    public static void main(String[] args) {
        TValueGet getter = new TValueGet();
        getter.getSession()[1] = 3256;
        /*Metodun sadece get özellği bulunmaktadır ve değeri değiştirilebilinmektedir.
        Acık vardır açığı kapatmak için gelen dizinin kopyası döndürülmelidir.*/
        System.out.println(getter.toString());
    }
}
