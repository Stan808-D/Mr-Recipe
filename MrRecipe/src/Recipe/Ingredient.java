package Recipe;

public class Ingredient {
    private String name;
    private String type;
    private String measurement;

    public Ingredient(String name, String type, String measurement) {
        this.name = name;
        this.type = type;
        this.measurement = measurement;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getMeasurement() {
        return measurement;
    }
}
