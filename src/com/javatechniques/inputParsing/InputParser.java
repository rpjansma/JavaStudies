package com.javatechniques.inputParsing;

public class InputParser {

    public static String reverseText(String text) {
        if(text == null || text.isBlank()) {
            return text;
        }

        //Better than string when it needs to modify.
        //It only expands the memory on the same object to get the changes.
        StringBuilder reversed = new StringBuilder();

        for(int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        return reversed.toString();
    }

    public static String reverseTextWithStringBuilderFunction(String text){
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(reverseText("Textonho"));
        System.out.println(reverseTextWithStringBuilderFunction("Textonho"));
    }
}
