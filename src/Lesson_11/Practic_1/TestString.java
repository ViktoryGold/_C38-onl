package Lesson_11.Practic_1;

import java.util.Locale;

public class TestString {
    public static void main(String[] args) {
        mergeString();
        conversionString();
        replacementString();
        emptyString();

    }
    public static void mergeString() {
        String str1 = "Wonderful";
        String str2 = "day";
        System.out.println(str1 +" "+ str2);
        System.out.println(str1.concat(" ").concat(str2));
        System.out.println(String.join(" ", str1, str2));
        String st1 = "Amazing";
        String st2 = "amazing";
        equalityString(st1, st2);
        returnString(st1);
        lengthString(str1);
        serialNumber(st1);
        registerString(str2);
    }
    public static void equalityString(String s1, String s2) {
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
    public static void returnString(String s) {
        System.out.println(s.substring(2));
    }
    public static void lengthString(String s) {
        System.out.println(s.length());
    }
    public static void serialNumber(String s) {
        System.out.println(s.indexOf("A"));
    }
    public static void conversionString() {
        boolean value = true;
        String string = Boolean.toString(value);
        System.out.println(string);
        String string1 = String.valueOf(value);
        System.out.println(string1);
    }
    public static void registerString(String s) {
        System.out.println(s.toUpperCase(Locale.ROOT));
    }
    public static void replacementString() {
        String string = "    4r1gbk1n67881   ";
        String result = string.replace("1", "%");
        System.out.println(result);
        spaceString(string);
    }
    public static void spaceString(String s) {
        String res = s.trim();
        String r = s.strip();
        System.out.println(res);
        System.out.println(r);
    }
    public static void emptyString() {
        String str = "";
        String str1 = " ";
        String str2 = "Математическое выражение — это запись, содержащая числа, " +
                "знаки действий, скобки и, возможно, буквы.";
        if (str != null && str.isEmpty()) {
            System.out.println("Строка пустая!");
        }
        Boolean f = str1 != null && str1.isBlank();
        System.out.println(f);
        splitString(str2);
    }
    public static void splitString(String s) {
        String[] array = s.split("[—,.]");
        for (String st : array) {
            System.out.println(st);
        }
    }
}
