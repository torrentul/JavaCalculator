package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArabicToRom {
    private final List<String> enumbers = new ArrayList<>();

    public String getRomNumber(int number) {
        enumbers.addAll(Collections.singleton(""));
        enumbers.addAll(Collections.singleton(Numbers.I.toString()));
        enumbers.addAll(Collections.singleton(Numbers.II.toString()));
        enumbers.addAll(Collections.singleton(Numbers.III.toString()));
        enumbers.addAll(Collections.singleton(Numbers.IV.toString()));
        enumbers.addAll(Collections.singleton(Numbers.V.toString()));
        enumbers.addAll(Collections.singleton(Numbers.VI.toString()));
        enumbers.addAll(Collections.singleton(Numbers.VII.toString()));
        enumbers.addAll(Collections.singleton(Numbers.VIII.toString()));
        enumbers.addAll(Collections.singleton(Numbers.IX.toString()));
        enumbers.addAll(Collections.singleton(Numbers.X.toString()));

        String res = "";
        int count = (number-(number%10))/10;
        if (number<11){
            res = enumbers.get(number);
        }else if (number < 40){
            int dec=0;
            for (int i=0;i<count;i++){
                res=res+"X";
                dec++;
            }
            res=res+enumbers.get(number%10);
        }else if (number < 50){

            res="XL"+enumbers.get(number%10);
        }else if (number < 90){
            res="L";
            for (int i=0;i<count-5;i++){
                res=res+"X"; }
            res=res+enumbers.get(number%10);
        }else if (number < 100){
            res="XC"+enumbers.get(number%10);
        }else {
            res="C";
        }





        return res;
    }
}
