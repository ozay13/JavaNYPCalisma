/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matrix;

import com.factory.FactoryMat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ozaytunctan13
 */
public final class Array {

    public static int[][] shuffle(int[][] d) {
        List<Integer> vList = FactoryMat.toList(d);
        List<Integer> rList = new ArrayList<>();
        Integer[][] dizi = new Integer[1][1];
        for (int i = 0; i < d.length * d[0].length; i++) {
            int size = vList.size();
            int rd = (int) (Math.random() * size);
            rList.add(vList.get(rd));
            vList.remove(rd);
        }
        return FactoryMat.to2D(rList, d[0].length);
    }

    public static int[] randomArrayUnique(int min, int max, int size) {
        if (size <= Math.abs(max - min)) {
            int[] d = new int[size];
            int k = -1, value, j = 0;
            for (int i = 0; i < size; i++) {
                do {
                    value = (int) (Math.random() * (max - min)) + min;
                    k = Array.binarySearch(d, value);
                } while ((k >=0));
                d[j++] = value;

            }
            return d;
        } else {
            throw new RuntimeException("Lutfen dizinin boyutları ayarlayınız.");
        }
    }

    public static int binarySearch(int[] d, int value) {
        for (int i = 0; i < d.length; i++) {
            if(d[i]==value){
                return i;
            }
        }
        return -(Math.abs(value));
    }
    
    public static String println(int[][] d) {
        String m = "Matrix(" + d.length + "X" + d[0].length + ")\n";
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                m += d[i][j] + "  ";
            }
            m += "\n";
        }
        return m;
    }
public static String println(int[] d) {
       return Arrays.toString(d);
}
    public static void main(String[] args) {
        int[][] d = {{10, 2, 45}, {3, 9, 1}};
//        System.out.println(Array.println(d));
//        System.out.println(Array.println(Array.shuffle(d)));
         int []d2=Array.randomArrayUnique(5, 50, 5);
          System.out.println(Array.println(d2));
        
    }

}
