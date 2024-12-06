package com.example.WebCalculator;

public class CalculatorFunctions {

    String addNumbers (int a, int b){
        return "" + (a+b);
    }

    String subtractNumbers (int a, int b){
        return "" + (a-b);
    }

    String multiplyNumbers (int a, int b){
        return "" + (a*b);
    }

    String divideNumbers (int a, int b){
        if(b == 0){
            return "ERROR!!! DIVIDE BY ZERO";
        }else{
            return "" + (a/b);
        }

    }

}
