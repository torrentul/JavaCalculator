package com.company;

public class Processor {

    public String calculate (String a){
        String result = null;
        String[] strings = a.split(" ");
        int number1 ;
        int number2;
        try {
            number1=Integer.parseInt(strings[0]);
            number2=Integer.parseInt(strings[2]);

        }catch (Exception e){
            try {
                RomanToArabic romanToArabic = new RomanToArabic();
                number1 = romanToArabic.convert(strings[0]);
                number2 = romanToArabic.convert(strings[2]);
            }catch (Exception exception){
                throw exception;
            }
        }
        try {
            MathOperator mathOperator = new MathOperator();
            result=String.valueOf(mathOperator.calculate(strings[1],number1,number2));
        }catch (Exception e){

        }



        return result;
    }


}
