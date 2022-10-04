import java.util.Objects;

public class Mammals extends Animals {
    private String livingEnvironment;  //тип пищи
    private double speedOfMovement;  //скорость передвижения

    public Mammals(String nickname, int numberOfYears, String livingEnvironment, double speedOfMovement) {
        super(nickname, numberOfYears);
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "поле";
        }
        if (speedOfMovement > 0) {
            this.speedOfMovement = speedOfMovement;
        } else {
            this.speedOfMovement = 1;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public double getSpeedOfMovement() {
        return speedOfMovement;
    }

    public void setSpeedOfMovement(double speedOfMovement) {
        this.speedOfMovement = speedOfMovement;
    }

    public void walk() {  //гулять
        System.out.println("гуляет в течении дня");
    }

    @Override
    public void eat() {
        System.out.println("питается плотью или растительностью");
    }

    @Override
    public void sleep() {
        System.out.println("спит в основном ночью");
    }

    @Override
    public void moveAround() {
        System.out.println("активен в основном днём");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Double.compare(mammals.speedOfMovement, speedOfMovement) == 0 && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speedOfMovement);
    }

    @Override
    public String toString() {
        return "Млекопитающее{" +
                "среда обитания - '" + livingEnvironment + '\'' +
                ", скорость пережвижения - " + speedOfMovement +
                '}';
    }
}
