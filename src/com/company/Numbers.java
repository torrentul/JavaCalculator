package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Numbers {
    I(1,"I"),
    II(2, "II"),
    III(3, "III"),
    IV(4, "IV"),
    V(5, "V"),
    VI(6, "VI"),
    VII(7, "VII"),
    VIII(8, "VIII"),
    IX(9, "IX"),
    X(10, "X"),
    ;
    private final int number;
    private final String romNumber;


    Numbers(int number, String romNumber) {
        this.number = number;
        this.romNumber = romNumber;
    }


    public int getNumber() {
        return number;
    }



}
