package org.example;

import java.util.Arrays;
import java.util.Random;

public class ArrExtended {
    double[] randomArr;
    double[][] arrNegPos;



    public double[] createArr() {
        Random random = new Random();
        randomArr = new double[800];
        for (int i = 0; i < 800; i++) {
            randomArr[i] = random.nextDouble() * 2000000 - 1000000;
        }
        return randomArr;
    }

    public double[][] sort(){
        int m = 0;
        int n = 0;
        for (int i = 0; i < 800; i++) {
            if(randomArr[i] > 0){
                arrNegPos[1][m] = randomArr[i];
                m ++;
            }else{
                arrNegPos[2][m] = randomArr[i];
                n ++;
            }

        }

    return arrNegPos;
    }


}
