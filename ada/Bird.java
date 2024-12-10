public abstract class Bird extends Animal {
    private int wingSpan;
    protected float flightSpeed;
    protected String nestingHabit;

    public Bird(String species, String habitat, boolean isNocturnal, int wingSpan, float flightSpeed, String nestingHabit) {
        super(species, habitat, isNocturnal);
        this.wingSpan = wingSpan;
        this.flightSpeed = flightSpeed;
        this.nestingHabit = nestingHabit;
    }

    public void layEggs(){
        System.out.println(this.getClass().getName() + " is laying eggs");
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public float getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(float flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    public String getNestingHabit() {
        return nestingHabit;
    }

    public void setNestingHabit(String nestingHabit) {
        this.nestingHabit = nestingHabit;
    }
}
