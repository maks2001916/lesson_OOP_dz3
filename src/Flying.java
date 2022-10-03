import java.util.Objects;

public class Flying extends  Birds{
    private String typeOfForesight;  //способ передвижения

    public Flying(String nickname, int numberOfYears, String livingEnvironment, String typeOfForesight) {
        super(nickname, numberOfYears, livingEnvironment);
        this.typeOfForesight = typeOfForesight;
    }

    public void toFly() {  //летать
        System.out.println("летает во время охоты");
    }

    public void setTypeOfForesight(String typeOfForesight) {
        this.typeOfForesight = typeOfForesight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfForesight, flying.typeOfForesight);
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
