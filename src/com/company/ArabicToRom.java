package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArabicToRom {
    private final List<String> enumbers = new ArrayList<>();

    public String getRomNumber(int number) {
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

        String res = enumbers.get(number-1);
        return res;
    }
}
