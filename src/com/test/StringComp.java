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
public class StringComp {

    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        StringBuilder build = new StringBuilder();
        FactoryTime.tic();
        for (int i = 0; i < 100_000_00; i++) {
            build.append("ozay\n");
        }
        FactoryTime.toc();
    }
}
