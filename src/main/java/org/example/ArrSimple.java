package org.example;

import java.util.Random;

public class ArrSimple {
    double[] randomArr;
    double summPositive = 0;
    double summNegative = 0;


    public double[] createArr() {
        Random random = new Random();
        randomArr = new double[100];
        for (int i = 0; i < 100; i++) {
            randomArr[i] = random.nextDouble() * 2000 - 1000;
        }
        return randomArr;
    }

    public double summPositive(){
        for (int i = 0; i < randomArr.length ; i++) {
            if (randomArr[i] > 0){
                summPositive += randomArr[i];
            }
        }
        return summPositive;
    }
    public double summNegative(){
        for (int i = 0; i < randomArr.length ; i++) {
            if (randomArr[i] < 0){
                summNegative += randomArr[i];
            }
        }
        return summNegative;
    }




}
