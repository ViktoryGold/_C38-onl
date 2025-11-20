package Lesson_11.Practic_2;

public class TestStringBuilder {
    public static void main(String[] args) {
        createStringBuilder();

    }
    public static void createStringBuilder() {
        StringBuilder str = new StringBuilder("Привет, мир!");
        outputString(str);
        appendString(str);
        insertString(str);
        deleteString(str);

    }
    public static void appendString(StringBuilder s) {
        outputString(s.append("xxxx"));
    }
    public static void insertString(StringBuilder s) {
        outputString(s.insert(5, "y"));
    }
    public static void deleteString(StringBuilder s) {
        outputString(s.delete(2,7));
        reverseString(s);
    }
    public static void reverseString(StringBuilder s) {
        outputString(s.reverse());
    }
    public static void outputString(StringBuilder s) {
        System.out.println(s.toString());
    }
}
