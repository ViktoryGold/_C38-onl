package Lesson_18.Practic_3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Developer> developers = Arrays.asList(
                new Developer(5,"Nick"),
                new Developer(12,"Oleg"),
                new Developer(8,"anna"),
                new Developer(15,"Nina"),
                new Developer(20,"Alex"),
                new Developer(26,"Andrey")
        );
        developers.stream()
                .filter(dev -> dev.getId() > 10)
                .filter(dev -> dev.getName().startsWith("An"))
                .forEach(System.out::println);
    }
}
