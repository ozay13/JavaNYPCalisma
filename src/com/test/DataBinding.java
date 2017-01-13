/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

/**
 *
 * @author ozaytunctan13
 */
interface Runner{
    public abstract void run();
}
class Animal implements Runner{

    @Override
    public void run() {
        System.out.println("Animal Koşmaya Başladı");
    }
    
}
class Kopek extends Animal{

    @Override
    public void run() {
        System.out.println("Kopek koşmaya başladı... ");
    }
    
    
}
class Kedi extends Animal{

    @Override
    public void run() {
       System.out.println("Kedi koşmaya başladı... ");
    }
    
}
public class DataBinding {
    
    public void runAnimal(Runner r){
        r.run();
    }
    public static void main(String[] args) {
        Animal a1=new Animal();
        Kopek k1=new Kopek();
        Kedi k2=new Kedi();
        DataBinding d=new DataBinding();
          d.runAnimal(a1);
          d.runAnimal(k1);
          d.runAnimal(k2);
    }
}
