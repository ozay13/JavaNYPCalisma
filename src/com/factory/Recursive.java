/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factory;

/**
 *
 * @author ozaytunctan13
 */
public class Recursive {

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static int faktoriyel(int n) {
        if (n == 0) {
            return 1;
        }
        return n * faktoriyel(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(Recursive.faktoriyel(6));
    }
}
