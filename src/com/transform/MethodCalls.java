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


public class MethodCalls 
{
    public static void main(String[] args) 
    {
        a1(8);
    }

    static int a1(int a1) 
    {
        System.out.print(" a1 = " + a1);
        return a2(a1++);
    }

    static int a2(int a2) 
    {
        if (a2 == 0) 
        {
            return 10;
        }
        System.out.print(" a2 = " + a2);
        return a1(a2 / 2);
    }
}
