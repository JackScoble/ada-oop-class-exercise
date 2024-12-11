public class Crow extends Bird{
    private int eggCount;

    public Crow(String species, String habitat, boolean isNocturnal, int wingSpan, float flightSpeed, String nestingHabit) {
        super(species, habitat, isNocturnal, wingSpan, flightSpeed, nestingHabit);
    }

    private void nest(){

    }

    public void fly(){

    }

    public void grieve(){

    }

    public int getEggCount() {
        return eggCount;
    }

    public void setEggCount(int eggCount) {
        this.eggCount = eggCount;
    }

    @Override
    public void makeSound() {
        System.out.println("Caw!");
    }

    @Override
    public String showInfo() {
        return "Crow info{" + '\n' +
                "eggCount=" + eggCount + '\n' +
                ", runningSpeed=" + runningSpeed + '\n' +
                ", wingSpan=" + getWingSpan() + '\n' +
                ", flightSpeed=" + getFlightSpeed() + '\n' +
                ", nestingHabit=" + getNestingHabit() + '\n' +
                ", species=" + getSpecies() + '\n' +
                ", habitat=" + getHabitat() + '\n' +
                ", isNocturnal=" + isNocturnal() + '\n' +
                '}';
    }

    @Override
    public void feed() {

    }
}