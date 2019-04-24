package com.utils;

import java.util.Random;

public class Utils {
    public static int randomCode() {
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            str.append(random.nextInt(10));
        }
        return Integer.parseInt(str.toString());
    }

}
