public class Main {
    public static void main(String[] args) {
        Herbivores gazel = new Herbivores("газель", 5, "поле",
                60, "растительность");
        Herbivores giraffe = new Herbivores("жираф", 6, "степь",
                45, "растительность");
        Herbivores horse = new Herbivores("лошадь", 7, "степь",
                60, "растительность");
        Predators hyena = new Predators("гиена", 3, "сованна",
                40, "плоть");
        Predators tigr = new Predators("тигр", 8, "сованна",
                50, "плоть");
        Predators bear = new Predators("медведь", 16, "тайга",
                45, "плоть");
        Amphibians frog = new Amphibians("лягушка", 6, "болото");
        Amphibians alreadyАreshwater = new Amphibians("уж пресноводный", 19, "болото");
        Flightless peacock = new Flightless("павлин", 15, "джунгли", "пешком");
        Flightless penguin = new Flightless("пингвин", 5, "южный полюс", "пешком/впоавь");
        Flightless dodo = new Flightless("додо", 5, "остров Маврикий", "пешком");
        Flying seagull = new Flying("чайка", 20, "близь морей", "полёт");
        Flying albatross = new Flying("альбатрос", 40, "близь морей", "полёт");
        Flying falcon = new Flying("сокол", 18, "опушка леса", "полёт");
        System.out.println(gazel);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tigr);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(alreadyАreshwater);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
    }
}