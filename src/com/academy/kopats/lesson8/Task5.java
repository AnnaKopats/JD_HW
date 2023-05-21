package com.academy.kopats.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        printTelNum("L+24151ondo ljkkl,nv m 236+326755836 00 6/.l6941l;jdfn jklshfd+254565451232416546541kjlsb ");
    }

    public static void printTelNum(String s) {
        Pattern pattern = Pattern.compile("[+][\\d]{9,14}");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.print(matcher.group() + "; ");

        }
    }
}
