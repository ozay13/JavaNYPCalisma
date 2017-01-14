package com.transform;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ozaytunctan13
 */
public class Bowler {
    int runs = 81;
    public static void main(String[] args) {
        new Bowler().go();
    }
    int balls = 75;
    void go() {
        dec(--balls);
        System.out.print(runs + ",");
        System.out.print(balls + ",");
    }
    void dec(int balls) {
        balls -= 20;
        System.out.print(balls + ",");
    }
}
