public abstract class Mammal extends Animal{

    private int gestationPeriodInWeeks;
    protected float furDensity;
    protected float bodyTemperature;

    public Mammal(String species, String habitat, boolean isNocturnal, int gestationPeriodInWeeks, float furDensity, float bodyTemperature) {
        super(species, habitat, isNocturnal);
    }


    public void giveBirth() {
        System.out.println(this.getClass().getName() + " giving birth");
    }

    public int getGestationPeriodInWeeks() {
        return gestationPeriodInWeeks;
    }

    public float getFurDensity() {
        return furDensity;
    }

    public float getBodyTemperature() {
        return bodyTemperature;
    }
}
