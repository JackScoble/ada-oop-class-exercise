public class Elephant extends Mammal {
    private float trunkLength;
    protected float tuskSize;
    public float memoryCapacity;

    public Elephant(String species, String habitat, boolean isNocturnal, int gestationPeriodInWeeks, float furDensity, float bodyTemperature) {
        super(species, habitat, isNocturnal, gestationPeriodInWeeks, furDensity, bodyTemperature);
    }

    private void bathe(){
        System.out.println("Elephant bathing");
    }

    protected void forage(){
        System.out.println("Elephant foraging");
    }

    public void migrate(){
        System.out.println("Elephant migrating");
    }

    public float getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(float trunkLength) {
        this.trunkLength = trunkLength;
    }

    public float getTuskSize() {
        return tuskSize;
    }

    public void setTuskSize(float tuskSize) {
        this.tuskSize = tuskSize;
    }

    public float getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(float memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    @Override
    protected void grow() {

    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet!");
    }

    @Override
    public String showInfo() {
        return "Elephant: {" + '\n' +
                "trunkLength=" + trunkLength + '\n' +
                ", tuskSize=" + tuskSize + '\n' +
                ", memoryCapacity=" + memoryCapacity + '\n' +
                ", gestationPeriodInWeeks=" + getGestationPeriodInWeeks() + '\n' +
                ", furDensity=" + getFurDensity() + '\n' +
                ", bodyTemperature=" + getBodyTemperature() + '\n' +
                ", species=" + getSpecies() + '\n' +
                ", habitat=" + getHabitat() + '\n' +
                ", isNocturnal=" + isNocturnal() + '\n' +
                '}';
    }

    @Override
    public void feed() {

    }
}
