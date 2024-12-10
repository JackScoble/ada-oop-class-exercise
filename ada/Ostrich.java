public class Ostrich extends Bird{
    private int eggCount;
    protected float runningSpeed;


    public Ostrich(String species, String habitat, boolean isNocturnal, int wingSpan, float flightSpeed, String nestingHabit) {
        super(species, habitat, isNocturnal, wingSpan, flightSpeed, nestingHabit);
    }


    private void nest(){

    }

    public void chase(){

    }

    public int getEggCount() {
        return eggCount;
    }

    public void setEggCount(int eggCount) {
        this.eggCount = eggCount;
    }

    public float getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(float runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    @Override
    public void makeSound() {
        System.out.println("Boom!");
    }

    @Override
    public String showInfo() {
        return "Ostrich info{" + '\n' +
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
