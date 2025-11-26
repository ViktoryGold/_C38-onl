package Lesson_13.Practic_2;

public class Person {
    private int age;

    public Person(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Лицо ещё не достигло совершеннолетия!");
        } else if (age > 100){
            throw new MyException("Отличная шутка, а теперь введите реальные цифры.");
        }
        this.age = age;
    }
    public String getAge(int age, String str) {
        if (age <= 20 || age >= 25 && age <= 30 || age >= 35 && age <= 40
                || age >= 45 && age <= 50 || age >= 55 && age <= 60
                || age >= 65 && age <= 70 || age >= 75 && age <= 80
                || age >= 85 && age <= 90 || age >= 95 && age <= 100) {
            str = "лет";
        } else if (age == 21 || age == 31 || age == 41 || age == 51
                || age == 61 || age == 71 || age == 81 || age == 91) {
            str = "год";
        } else if (((age >= 22) && (age <= 24)) || ((age >= 32) && (age <= 34))
                || ((age >= 42) && (age <= 44)) || ((age >= 52) && (age <= 54))
                || ((age >= 62) && (age <= 64)) || ((age >= 72) && (age <= 74))
                || ((age >= 82) && (age <= 84)) || ((age >= 92) && (age <= 94))) {
            str = "года";
        }
        return str;
    }
    @Override
    public String toString() {
        return "совершеннолетний человек, возраст " + age + " "
                + getAge(age, "") + ".";
    }
}
