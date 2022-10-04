import java.util.Objects;

public class Flightless extends  Birds{
    private String typeOfForesight;  //способ передвижения

    public Flightless(String nickname, int numberOfYears, String livingEnvironment, String typeOfForesight) {
        super(nickname, numberOfYears, livingEnvironment);
        if (typeOfForesight != null && !typeOfForesight.isEmpty() && !typeOfForesight.isBlank()) {
            this.typeOfForesight = typeOfForesight;
        } else {
            this.typeOfForesight = "пешком";
        }
    }

    public void walk() {  //гулять
        System.out.println("гуляет в течении дня");
    }

    public String getTypeOfForesight() {
        return typeOfForesight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfForesight, that.typeOfForesight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfForesight);
    }

    @Override
    public String toString() {
        return "не летающее{" + "; кличка - " + getNickname() +
                "; время жизни - " + getNumberOfYears() + " лет" + '}';
    }
}
