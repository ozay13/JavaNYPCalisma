/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ozaytunctan13
 */
public class FactoryMat {

    public static double[][] rand2D(int min, int max, int r, int c) {
        double[][] ret = new double[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = (Math.random() * (max - min) + min);
            }
        }
        return ret;
    }
    public static int[][]toCastInt(double[][]d){
        int [][]ret=new int[d.length][d[0].length];
        int i=0,j=0;
        for (double[] ds : d) {
            i++;
            j=0;
            for (double e : ds) {
                ret[i][j]=(int)e;
            }
        }
        return ret;
    }
    public static double[][]toCastDouble(int[][]d){
        double [][]ret=new double[d.length][d[0].length];
        int i=0,j=0;
        for (int[] ds : d) {
            i++;
            j=0;
            for (double e : ds) {
                ret[i][j]=e;
            }
        }
        return ret;
    }
    public static int[][] toList2D(List<Integer> list, int c) {
        int[][] ret = new int[(int) (list.size() / c)][c];
        int k = 0;
        for (int i = 0; i < list.size() / c; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = list.get(k++);
            }
        }
        return ret;
    }
    public static int[][]toInt2D(Integer [][]v){
        int[][]ret=new int[v.length][v[0].length];
        int k=0,j=0;
        for (Integer[] is : v) {
            k++;
            j=0;
            for (Integer i : is) {
                ret[k][j++]=(int)i;
            }
        }
        return ret;
    }
    public static List<Integer> toList(int[][] m) {
        List<Integer> liste = new ArrayList<>();
        for (int[] is : m) {
            for (int k : is) {
                liste.add(k);
            }
        }
        return liste;

    }
      public static List<Integer> toList(int[]m) {
        List<Integer> liste = new ArrayList<>();
            for (int k :m) {
                liste.add(k);
            }
        return liste;

    }
}
