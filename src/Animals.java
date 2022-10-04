import java.util.Objects;

public abstract class Animals {
    private String nickname;  //кличка
    private int numberOfYears;  //количество лет

    public Animals(String nickname, int numberOfYears) {
        if (nickname != null && !nickname.isEmpty() && !nickname.isBlank()) {
            this.nickname = nickname;
        } else {
            this.nickname = "животное";
        }
        if (numberOfYears > 0) {
            this.numberOfYears = numberOfYears;
        } else {
            this.numberOfYears = 1;
        }
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void moveAround();

    public String getNickname() {
        return nickname;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return numberOfYears == animals.numberOfYears && Objects.equals(nickname, animals.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, numberOfYears);
    }

    @Override
    public String toString() {
        return "Животные{" +
                "кличка - '" + nickname + '\'' +
                ", количество лет - " + numberOfYears +
                '}';
    }
}
