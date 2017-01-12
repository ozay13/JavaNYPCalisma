/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.classification.DataSet;
import com.factory.FactoryNetwork;
import com.matrix.Matrix;

/**
 *
 * @author ozaytunctan13
 */
public class network {
    public static void main(String[] args) {
        double[][] d = {{1,2,8}, 
                        {2,2,3},
                        {1,1,1},
                        {7,9,1},
                        {1,1,1},
                        {1,1,1},
                        {1,1,1},
                        {1,1,1},
                        {1,1,1},
                        {1,1,1}
                     };
        Matrix cm=Matrix.getInstance(d);
        DataSet ds=FactoryNetwork.networkIntervalTrainTest(cm, 0.99);
         ds.train.printLn();
        ds.test.printLn();
        ds.train.add(Matrix.getInstance(ds.test.getValue())).printLn();
       
    }
}
