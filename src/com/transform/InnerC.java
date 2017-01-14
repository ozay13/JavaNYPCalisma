/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transform;

/**
 *
 * @author ozaytunctan13
 */
public class InnerC {
    public static void main(String args[]) {
        InnerC q = new InnerC();
        q.myMethod();
        MyNest.main("Hello MeritCampus");
    }
    void myMethod() {
        System.out.println("Welcome to the JAVA world");
    }
    static class MyNest {
        public static void main(String st) {
            System.out.println(st);
        }
    }
}