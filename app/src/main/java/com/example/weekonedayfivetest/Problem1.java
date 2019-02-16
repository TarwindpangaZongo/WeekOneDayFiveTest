package com.example.weekonedayfivetest;

import android.util.Log;
import java.util.List;

public class Problem1 {


    public void findDuplicates(List<String> strings){
        for (String a: strings) {
            for (String b: strings) {
                if (a.equals(b)) Log.d("Duplictes","duplicate found" + a);
            }
        }
    }
}
