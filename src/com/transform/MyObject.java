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
public class MyObject {
    public static void main(String[] args) {
        MyObject.myStaticMethod();
        System.out.println(MyObject.myStaticMethod());
    }

    public static String memberVar;
    static private String memberStaticVar;
    static public String myStaticMethod() {
        memberVar = "Value";
        memberStaticVar = "Value";
        MyObject obj = new MyObject();
        obj.memberVar = "Value";
        System.out.println("Have a nice to Participants");
        return ("No Error");
    }
}
