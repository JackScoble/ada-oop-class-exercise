public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark("Great White Shark", "Ocean", false, "White Shark");
        shark.setTeethCount(300);
        shark.setFinSize(5.5f);
        shark.setAttackSpeed(25.5f);
        System.out.println(shark.showInfo());

        Bird bird = new Ostrich("Ostrich", "Plains", false, 7, 50.5f, "Nest");
        System.out.println(bird.showInfo());

        Mammal mammal = new Elephant("Elephant", "Jungle", false, 22, 0.5f, 37.5f);
        System.out.println(mammal.showInfo());
    }
}