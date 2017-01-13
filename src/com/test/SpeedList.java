/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.factory.FactoryTime;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author ozaytunctan13
 */
public class SpeedList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        LinkedList<Integer>list2=new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
            list2.add(i);
        }
       FactoryTime.tic();
        for (int i = 0; i < 100; i++) {
           // list.add(i, i);
           //list2.add(i, i);
        }
         FactoryTime.toc();
        
        // 1.Listeye sırayla eleman ekleme için ArrayList daha hızlı
        // 2.Listeden eleman cikarma için LinkedList daha hızlı
        //3.Araya eleman ekleme için LinkedList daha hızlı
        
    }
}
