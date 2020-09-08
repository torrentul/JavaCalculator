package com.company;

public class MathOperator {
    private String a;
    private int num1;
    private int num2;

    public String MathOperator(String a, int num1, int num2) {
        this.a = a;
        this.num1 = num1;
        this.num2 = num2;

        return calculate(a, num1, num2);
    }


    public String calculate(String a, int num1, int num2){

        if (a.equals("-")){
            return String.valueOf(num1-num2);
        }else if (a.equals("/")){
            return String.valueOf(num1/num2);
        }else if (a.equals("*")){
            return String.valueOf(num1*num2);
        }else if (a.equals("+")){
            return String.valueOf(num1+num2);
        }else {return "";}



    }

}
