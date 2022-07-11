package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Integer NOD(Integer a, Integer b) {
        while (b !=0) {
            Integer tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static class Fraction {
        public Integer chis;
        public Integer znam;
        public Fraction(Integer num1, Integer num2) {
            this.chis = num1;
            this.znam = num2;
        }
    }
    public static String calculate(String num1, String operation, String num2) {
        Integer chis = 0, znam = 0, num = 0;
        String[] first_numb = new String[2];
        String[] second_numb = new String[2];
        ArrayList<Fraction> nums = new ArrayList<Fraction>();
        if(num1.indexOf("/")==-1)
            nums.add(new Fraction(Integer.valueOf(num1),1));
        else{
            first_numb = num1.split("/");
            nums.add(new Fraction(Integer.valueOf(first_numb[0]),Integer.valueOf(first_numb[1])));
        }
        if(num2.indexOf("/")==-1)
            nums.add(new Fraction(Integer.valueOf(num2),1));
        else{
            second_numb = num2.split("/");
            nums.add(new Fraction(Integer.valueOf(second_numb[0]),Integer.valueOf(second_numb[1])));
        }
        if(nums.get(0).znam != 0 && nums.get(1).znam != 0) {
            switch (operation) {
                case ("+"):
                    chis = nums.get(0).chis * nums.get(1).znam + nums.get(0).znam * nums.get(1).chis;
                    znam = nums.get(0).znam * nums.get(1).znam;
                    break;
                case ("-"):
                    chis = nums.get(0).chis * nums.get(1).znam - nums.get(0).znam * nums.get(1).chis;
                    znam = nums.get(0).znam * nums.get(1).znam;
                    break;
                case ("*"):
                    chis = nums.get(0).chis * nums.get(1).chis;
                    znam = nums.get(0).znam * nums.get(1).znam;
                    break;
                case ("/"):
                    if(nums.get(1).chis == 0)
                        return null;
                    else {
                        chis = nums.get(1).znam * nums.get(0).chis;
                        znam = nums.get(0).znam * nums.get(1).chis;
                    }
                    break;
            }
            num = NOD(chis, znam);
            if (znam / num == 1)
                return String.valueOf(chis / num);
            else
                return String.valueOf(chis / num) + "/" + String.valueOf(znam / num);
        }
        else{
            return null;
        }
    }
}