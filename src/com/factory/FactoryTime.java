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
public class FactoryTime {

    private static long start;
    private static long end;
    private static long elapsed;

    public static void tic() {
        start = System.currentTimeMillis();
    }

    public static long toc() {
        end = System.currentTimeMillis();
        elapsed = (end - start);
        System.out.println("Elapsed time is:" + elapsed);
        return elapsed;

    }
}
