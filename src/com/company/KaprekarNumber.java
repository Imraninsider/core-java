package com.company;

import static java.lang.Math.pow;

public class KaprekarNumber {
    public static int checkKaprekarNumber(Number number){
        if(number.getN()<=0)
            return 0;
        int n = number.getN();
        int squareNumber = n*n;

        int d = getDigits(n);

        int leftSideNumber = squareNumber/(int)pow(10,d);
//        System.out.println("leftNumber "+leftSideNumber);
        int rightSideNumber = squareNumber%(int)pow(10,d);
//        System.out.println("rightNumber "+rightSideNumber);
        if((leftSideNumber+rightSideNumber) == n)
            return  1;
        else
            return 0;

    }
    private static int getDigits(int num){
        int temp=0;
        while (num>0){
            num= num/10;
            temp++;
        }
        return  temp;
    }
}
