package com.javatechniques.validation;

public class StringValidation {

    public static boolean allTextIsUppercase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean allTextIsLowercase(String s) {
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static boolean isPasswordComplex(String password) {
        return password.chars().anyMatch(Character::isUpperCase)
                && password.chars().anyMatch(Character::isLowerCase)
                && password.chars().anyMatch(Character::isDigit);
    }

    public static void main (String[] args) {
        System.out.println(isPasswordComplex("pingola"));
        System.out.println(isPasswordComplex("pi!1aGngola"));
        System.out.println(isPasswordComplex("pingoladR21a"));

        System.out.println(allTextIsUppercase("UPPERCASE"));
        System.out.println(allTextIsUppercase("uppercase"));

        System.out.println(allTextIsLowercase("LOWERCASE"));
        System.out.println(allTextIsLowercase("lowercase"));


    }
}
