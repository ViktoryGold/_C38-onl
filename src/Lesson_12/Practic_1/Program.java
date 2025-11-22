package Lesson_12.Practic_1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {
        returnNumbers();
        replacingCharacter();

    }
    public static void returnNumbers() {
        String text = "Today my 17th lesson. I'm the best 1! Find me in inst: @teachmeskills";
        ArrayList<Integer> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }
        System.out.println(numbers);
        replaceLetter(text);
        returnLine(text);
        String s = null;
        isNull(s);
        searchName();
    }
    public static void replaceLetter(String str) {
        String result = str.replaceAll("[A-Za-z]", "&");
        System.out.println(result);
    }
    public static void returnLine(String str) {
        Pattern pattern = Pattern.compile("[^:]*");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public static void isNull(String str) {
        boolean result = str == null;
        System.out.println(result);
    }
    public static void replacingCharacter() {
        String string = "Hello \n world \n !!!";
        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(string);
        String result = matcher.replaceAll("\"\"");
        System.out.println(result);
    }
    public static void searchName() {
        String str = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
        String reg = "\\s[А-Я][а-яё]+\\s+[А-Я][а-яё]+\\s";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
