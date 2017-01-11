/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matrix;

import com.factory.FactoryMat;

/**
 *
 * @author ozaytunctan13
 */
public class Matrix {

    private double[][] cm;
    private int row;
    private int col;
    private Matrix clone;
    private Matrix(int r, int c) {
        cm = new double[r][c];
        this.row = r;
        this.col = c;
    }
    private Matrix(double[][] m) {
        cm = new double[m.length][m[0].length];
        this.row = m.length;
        this.col = m[0].length;
        this.cm = m;
    }
    public static Matrix getInstance(int r, int c) {
        return new Matrix(r, c);
    }
    public static Matrix getInstance(double[][] m) {
        return new Matrix(m);
    }
    public int getRows() {
        return this.row;
    }
    public int getCols() {
        return this.col;
    }
    public double[][] getValue() {
        return this.cm;
    }
    public Matrix add(Matrix m) {
        double[][] ret = new double[m.getRows()][m.getCols()];
        for (int i = 0; i < m.getRows(); i++) {
            for (int j = 0; j < m.getCols(); j++) {
                ret[i][j] = this.cm[i][j] + m.getValue()[i][j];
            }
        }
        return new Matrix(ret);
    }
    public Matrix transpose() {
        double[][] ret = new double[this.getCols()][this.getRows()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getCols(); j++) {
                ret[j][i] = this.cm[i][j];
            }
        }
        return new Matrix(ret);
    }
    public Matrix multiply(Matrix m1) {
        double[][] ret = new double[m1.getRows()][m1.getCols()];
        if(m1.getCols()!=this.row){
            throw new RuntimeException("Arrays Dimension");
        }
        else{
            for (int i = 0; i < m1.getRows(); i++) {
            for (int j = 0; j < m1.getCols(); j++) {
                for (int k = 0; k < m1.getCols(); k++) {
                    ret[i][j] += (this.cm[i][k] * (m1.getValue()[k][j]));
                }
            }
        }
        }
        return new Matrix(ret);
    }
    public Matrix randDouble(int min,int max,int r,int c){
        return new Matrix(FactoryMat.rand2D(min, max, r, c));
    }
    
    public Matrix printLn() {
        String m = "Matrix(" + this.row + "X" + this.col + ")\n";
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getCols(); j++) {
                m += this.cm[i][j] + "  ";
            }
            m += "\n";
        }
        System.out.println(m);
        return this;
    }
    
   
}
