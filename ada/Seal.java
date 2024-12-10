public class Seal extends Mammal{
    private float blubberThickness;
    protected float swimSpeed;
    protected float diveDepth;

    public Seal(String species, String habitat, boolean isNocturnal, int gestationPeriodInWeeks, float furDensity, float bodyTemperature) {
        super(species, habitat, isNocturnal, gestationPeriodInWeeks, furDensity, bodyTemperature);
    }

    private void haulOut(){

    }

    public void sunBathe(){

    }

    public float getBlubberThickness() {
        return blubberThickness;
    }

    public void setBlubberThickness(float blubberThickness) {
        this.blubberThickness = blubberThickness;
    }

    public float getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(float swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public float getDiveDepth() {
        return diveDepth;
    }

    public void setDiveDepth(float diveDepth) {
        this.diveDepth = diveDepth;
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    @Override
    public String showInfo() {
        return "Seal: {" +
                "blubberThickness=" + blubberThickness + '\n' +
                ", swimSpeed=" + swimSpeed + '\n' +
                ", diveDepth=" + diveDepth + '\n' +
                ", gestationPeriodInWeeks=" + getGestationPeriodInWeeks() + '\n' +
                ", furDensity=" + getFurDensity() + '\n' +
                ", bodyTemperature=" + getBodyTemperature() + '\n' +
                ", species='" + getSpecies() + '\n' +
                ", habitat='" + getHabitat() + '\n' +
                ", isNocturnal=" + isNocturnal() + '\n' +
                '}';
    }

    @Override
    public void feed() {

    }
}
