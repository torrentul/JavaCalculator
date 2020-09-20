package com.company;

public class Processor {

    public String calculate (String a){
        String result = "Error";
        String[] strings = a.split(" ");
        int number1 ;
        int number2;
        try {
            number1=Integer.parseInt(strings[0]);
            number2=Integer.parseInt(strings[2]);
            MathOperator mathOperator = new MathOperator();
            String res =mathOperator.calculate(strings[1],number1,number2);
            return result=res;
        }catch (Exception e){
            try {
                RomanToArabic romanToArabic = new RomanToArabic();
                number1 = romanToArabic.convert(strings[0]);
                number2 = romanToArabic.convert(strings[2]);
                MathOperator mathOperator = new MathOperator();
                String res =mathOperator.calculate(strings[1],number1,number2);
                ArabicToRom arabicToRom = new ArabicToRom();
                result=arabicToRom.getRomNumber(Integer.parseInt(res));
                return result;
            }catch (Exception exception){
                throw exception;
            }
        }


    }


}
