package com.company.aptech;

public class EnglishTranslator implements INumberTranslator {
    @Override
    public String getString(int number) {
        //gioi han tu 0 den 9
        // đổi số bất kỳ => cái này đã có thư viện rồi
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "night";
            default:
                return "unknown";
        }
    }

    @Override
    public int getNumber(String str) {
        //"  Hoang "=> " hoang " => "hoang"
        //vd: nhap email, password, dang nhap, app facebook
        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        switch (str.toLowerCase().trim()) {
            case "zero":
                return numbers[0];
            case "one":
                return numbers[1];
            case "two":
                return numbers[2];
            case "three":
                return numbers[3];
            case "four":
                return numbers[4];
            case "five":
                return numbers[5];
            case "six":
                return numbers[6];
            case "seven":
                return numbers[7];
            case "eight":
                return numbers[8];
            case "night":
                return numbers[9];
            default:
                return -1;
        }
    }
}
