/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factory;

import com.classification.DataSet;
import com.deeplearning.NeuralNetwork;
import com.deeplearning.TrainInputLayer;
import com.matrix.Matrix;

/**
 *
 * @author ozaytunctan13
 */
public final class FactoryNetwork {
    public static DataSet networkIntervalTrainTest(Matrix cm,double oran){
        DataSet ret=new DataSet();
        int row=cm.getRows();
        int train=(int)(row*oran);
        if(train>0){
        ret.train=Matrix.getInstance(Array.split2D(cm,0,train));
        ret.test=Matrix.getInstance(Array.split2D(cm,train,row));
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Matrix boyutu yeterli değildir");
        }
        return ret;
    }
    public static boolean trainStart(Matrix train,NeuralNetwork head,TrainInputLayer t){
        return true;
    }
}
