import java.util.Objects;

public class Predators extends Mammals{
    private String livingEnvironment;  //тип пищи

    public Predators(String nickname, int numberOfYears, String livingEnvironment,
                     double speedOfMovement, String livingEnvironment1) {
        super(nickname, numberOfYears, livingEnvironment, speedOfMovement);
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty()) {
            this.livingEnvironment = livingEnvironment1;
        } else {
            this.livingEnvironment = "плоть";
        }
    }

    public void hunt() {  //охотиться
        System.out.println("охотится днём");
    }

    @Override
    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(livingEnvironment, predators.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Predators{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}
