import java.util.Objects;

public class Amphibians extends Animals {
    private String livingEnvironment;  //среда обитания

    public Amphibians(String nickname, int numberOfYears, String livingEnvironment) {
        super(nickname, numberOfYears);
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "болото";
        }
    }

    public void hunt() {  //охотиться
        System.out.println("охотится днём или ночью");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void moveAround() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "земноводное{" +
                "среда обитания - '" + livingEnvironment + '\'' +
                '}';
    }
}
