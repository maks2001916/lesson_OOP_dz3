import java.util.Objects;

public class Birds extends Animals{
    private String livingEnvironment;  //среда обитания

    public Birds(String nickname, int numberOfYears, String livingEnvironment) {
        super(nickname, numberOfYears);
        this.livingEnvironment = livingEnvironment;
    }

    public void hunt() {  //охотиться
        System.out.println("охотится днём или ночью");
    }

    @Override
    public void eat() {
        System.out.println("питается насекомыми или грызунами");
    }

    @Override
    public void sleep() {
        System.out.println("спит в основном ночью");
    }

    @Override
    public void moveAround() {
        System.out.println("активен днём");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "птица{" +
                "среда обитания - '" + livingEnvironment + '\'' +
                '}';
    }
}
