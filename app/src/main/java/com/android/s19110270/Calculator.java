package com.android.s19110270;

public class Calculator {

    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL, POW,FAC,LOG }

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double pow(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand,secondOperand);
    }

    public Double factorial(double firstOperand) {

        if (firstOperand % 1 != 0){
            return null;
        }
        double result=1;

        for(int i = 1;i<= Math.abs(firstOperand);i++){
            result*=i;
        }
        if (firstOperand <0)
            result = -result;
        return result;
    }
    public double logarith(double firstOperand, double secondOperand) {
        return Math.log(secondOperand) / Math.log(firstOperand);
    }

}
