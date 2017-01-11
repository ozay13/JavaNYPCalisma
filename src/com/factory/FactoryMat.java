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

    public static int[][] to2D(List<Integer> list, int c) {
        int[][] ret = new int[(int) (list.size() / c)][c];
        int k = 0;
        for (int i = 0; i < list.size() / c; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = list.get(k++);
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
}
