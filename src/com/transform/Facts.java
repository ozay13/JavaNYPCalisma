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
public class Facts {
    public static void main(String[] args) {
        System.out.println(Fact.fact(5));
        
    }
}
class Fact {
    static  int fact(int n) {
        return n > 1 ? (fact(n - 1) * n) : 1;
        
        
    }
}
