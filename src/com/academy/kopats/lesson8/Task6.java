package com.academy.kopats.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    //(\W|^)[\w.\-]{0,25}@(yahoo|hotmail|gmail)\.com(\W|$)
    public static void main(String[] args) {
        printEmail("If you were able to connectthena-win@gmail.com will appear va{}?!l!&^^e{}ry.borys@gmail.comin front of you to enter your login and password annakopats@mail.ru");
    }

    public static void printEmail(String s) {
        Pattern pattern = Pattern.compile("([A-zА-я])+([0-9\\\\-_+.^^{}$!%&?=])*([A-zА-я0-9\\\\-_\\\\+.{}$!%&?=])*@([A-zА-я])+([0-9\\\\-_\\\\+\\\\.])*([A-zА-я0-9\\\\-_\\\\+\\\\.])*[\\\\.]([A-zА-я]){2,3}");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.print(matcher.group() + "; ");

        }
    }
}
//([A-zА-я])+([0-9\\-_\\+\\.^^{}$!%&?=])*