/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.factory.FactoryTime;

/**
 *
 * @author ozaytunctan13
 */
interface Topla{
    public Sonuc topla(int a,int b);
}
interface Sonuc{
    public int sonuc();
}
interface Build{
    public Topla build();
}

public class Factory {
    
    public Builder build(){
        return new Builder();
    }
    
    public static class Builder implements Build,Topla,Sonuc{
       private int s1;
       private int s2;

        public Builder() {
        }
       
        public Builder(int a,int b) {
            this.s1=a;
            this.s2=b;
        }
           
        @Override
        public Topla build() {
           return new Builder();
        }

        @Override
        public Sonuc topla(int a, int b) {
          return new Builder(a, b) ;
        }

        @Override
        public int sonuc() {
            return (s1+s2);
        }
        
    }
    public static void main(String[] args) {
        Factory.Builder b=new Factory.Builder();         
                
//        FactoryTime.tic();
//         for (int i = 0; i < 100000000; i++) {
//              b.build().topla(i,i).sonuc();
//        }
//         FactoryTime.toc();
    }
}
