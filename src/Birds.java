public class Birds extends Animals{
    private String livingEnvironment;  //среда обитания

    public Birds(String nickname, int numberOfYears, String livingEnvironment) {
        super(nickname, numberOfYears);
        this.livingEnvironment = livingEnvironment;
    }

    public void hunt() {  //охотиться
        System.out.println("охотится днём или ночью");
    }
}
