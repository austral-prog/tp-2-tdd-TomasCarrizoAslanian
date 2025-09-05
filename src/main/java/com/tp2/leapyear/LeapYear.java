package com.tp2.leapyear;

public class LeapYear {

    public static boolean esBisiesto(int año) {
        if (año % 400 == 0) return true;
        if (año % 100 == 0) return false;
        return año % 4 == 0;
    }
}
