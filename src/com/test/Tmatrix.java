/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.matrix.Matrix;

/**
 *
 * @author ozaytunctan13
 */
public class Tmatrix {
    
    public static void main(String[] args) {
        double[][]d={{1,2},{2,2}};
        Matrix cm=Matrix.getInstance(d).randDouble(-5, 20, 2, 2).multiply(Matrix.getInstance(d)).printLn();
    }
}