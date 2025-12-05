package Lesson_15.Practic_1;

public class Country {
    private String name;
    private String capital;
    private String continent;

    public Country(String name, String capital, String continent) {
        this.name = name;
        this.capital = capital;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }
    public String getCapital() {
        return capital;
    }
    public String getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return "Country:" +
                "\n\tname = '" + name + "'" +
                "\n\tcapital = " + capital +
                "\n\tcontinent = " + continent;
    }
}
