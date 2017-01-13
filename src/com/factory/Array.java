/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factory;

import com.factory.FactoryMat;
import com.matrix.Matrix;
import java.awt.Dimension;
import java.awt.Point;
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
        return FactoryMat.toList2D(rList, d[0].length);
    }

    public static int sum(int[][] d) {
        int sum = 0;
        for (int[] is : d) {
            for (int i : is) {
                sum += i;
            }
        }
        return sum;
    }

    public static double avg(int[][] d) {
        int rc = d.length * d[0].length;
        int sum = Array.sum(d);
        int avg = sum / (rc);
        return avg;
    }

    public static List<Integer> asList(int[][] d) {
        return FactoryMat.toList(d);
    }

    public static int[][] frekans1D(int[] d) {
        Integer[][] cast = new Integer[1][1];
        List<Integer[]> liste = new ArrayList<>();
        List<Integer> vList = FactoryMat.toList(d);

        int frekans = 0;
        for (int i = 0; i < d.length; i++) {
            Integer[] pointer = new Integer[2];
            frekans = 0;
            Integer value = vList.get(i);
            for (int j = 0; j < vList.size(); j++) {
                if (value.compareTo(vList.get(j)) == 0) {
                    frekans++;
                    vList.remove(j);
                    j = 0;
                }

            }
            pointer[0] = value;
            pointer[1] = frekans;
            liste.add(pointer);

        }
        return FactoryMat.toInt2D(liste.toArray(cast));
    }

    public static void swap(int[] d, int from, int to) {
        int temp = d[from];
        d[from] = d[to];
        d[to] = temp;
    }

    public static int[][] randomArray(int min, int max, int r, int c) {
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                ret[i][j] = (int) (Math.random() * (max - min)) + min;
            }
        }
        return ret;
    }

    public static double[][] randomArrayDouble(double min, double max, int r, int c) {
        double[][] ret = new double[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                ret[i][j] = (Math.random() * (max - min)) + min;
            }
        }
        return ret;
    }

    public static int[] randomArrayUnique(int min, int max, int size) {
        if (size <= Math.abs(max - min)) {
            int[] d = new int[size];
            int k = -1, value, j = 0;
            for (int i = 0; i < size; i++) {
                do {
                    value = (int) (Math.random() * (max - min)) + min;
                    k = Array.binarySearch1D(d, value);
                } while ((k >= 0));
                d[j++] = value;

            }
            return d;
        } else {
            throw new RuntimeException("Lutfen dizinin boyutları ayarlayınız.");
        }
    }

    public static int binarySearch1D(int[] d, int value) {
        for (int i = 0; i < d.length; i++) {
            if (d[i] == value) {
                return i;
            }
        }
        return -(Math.abs(value));
    }

    public static List<Point> binarySearch2D(int[][] d, int value) {
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                if (d[i][j] == value) {
                    list.add(new Point(i, j));
                }
            }
        }
        return list;
    }

    public static int speedBinarySearch1D(int[] dizi, int arananSayi) {
        List<Integer> temp = FactoryMat.toList(dizi);
        int[] clone = dizi.clone();
        Arrays.parallelSort(clone);
        int bas = 0; // dizinin baslangıç indisini buluyoruz
        int son = dizi.length - 1; // dizinin son indisini buluyoruz
        while (bas <= son) { //
            int orta = (son + bas) / 2; // dizinin orta noktasını buluyoruz 
            if (arananSayi == clone[orta]) {
                return temp.indexOf(arananSayi);
            }
            if (arananSayi < clone[orta]) {
                son = orta - 1;
            } else {
                bas = orta + 1;
            }
        }
        return -1;
    }

    public static Point speedBinarySearch2D(int[][] dizi, int arananSayi) {
        int k = -1;
        for (int[] is : dizi) {
            k++;
            int ret = speedBinarySearch1D(is, arananSayi);
            if (ret >= 0) {
                Point px = new Point(k, ret);
                return px;
            }
        }
        return new Point();
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

    public static double[][] split2D(Matrix cm, int from, int to) {
        double[][] ret = new double[to - from][cm.getCols()];
        int k = 0;
        for (int j = from; j < to; j++) {
            ret[k++] = cm.getValue()[j];
        }
        return ret;
    }

    public static String println(int[] d) {
        return Arrays.toString(d);
    }

    public static void main(String[] args) {
//        int[][] d = {{10, 2, 45}, {3, 9, 10}};
////        System.out.println(Array.println(d));
////        System.out.println(Array.println(Array.shuffle(d)));
//        int[] d2 = Array.randomArrayUnique(5, 50, 5);
//        System.out.println(Array.println(d2));
//        List<Point> index = Array.binarySearch2D(d, 10);
//        for (int i = 0; i < index.size(); i++) {
//            Point p1 = index.get(i);
//            System.out.println("[row:" + p1.x + ",col:" + p1.y + "]");
//        }

        int[] d = {10, 2, 45, 3, 9, 10};
        int[][] d2 = {{10, 2, 45},
                      {3, 9, 10}};
//        System.out.println(Array.println(d));
//        Array.swap(d, 4, 1);
//        System.out.println(Array.println(d));
//        int[][] v = Array.frekans1D(d);
//        System.out.println(Array.println(v));
//        System.out.println(" ");       
        System.out.println(Array.speedBinarySearch2D(d2, 45).toString());
    }
}
