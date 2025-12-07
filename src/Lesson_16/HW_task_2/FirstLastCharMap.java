package Lesson_16.HW_task_2;

import java.util.HashMap;
import java.util.Map;

public class FirstLastCharMap {
    public static void main(String[] args) {
        String[] input = {"яблоко", "малина", "клубника", "черника", "голубика", "папайя"};
        Map<String, String> map = createMap(input);
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
    public static Map<String, String> createMap(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String string : strings) {
            String firstChar = String.valueOf(string.charAt(0));
            String lastChar = String.valueOf(string.charAt(string.length()-1));
            result.put(firstChar, lastChar);
        }
        return result;
    }
}
