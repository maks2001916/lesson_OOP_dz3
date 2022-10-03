import java.util.Objects;

public class Herbivores extends Mammals {
    private String typeOfFood;

    public Herbivores(String nickname, int numberOfYears, String livingEnvironment,
                      double speedOfMovement, String typeOfFood) {
        super(nickname, numberOfYears, livingEnvironment, speedOfMovement);

        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "растительность";
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public void graze() {
        System.out.println("пасётся днём");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "травоядное{" +
                "тип пищи - '" + typeOfFood + '\'' +
                '}';
    }
}
