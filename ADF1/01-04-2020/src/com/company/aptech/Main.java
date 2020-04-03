package com.company.aptech;

public class Main {

    public static void main(String[] args) {
        INumberTranslator englishTranslator = new EnglishTranslator();
        System.out.println("aa ="+englishTranslator.getNumber("FivE   "));
        System.out.println("aa ="+englishTranslator.getString(6));
    }
}
