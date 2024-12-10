public class Lion extends Mammal{
    private final String maneColour;
    private final float roarVolume;
    protected int prideSize;
    public float huntingSuccessRate;

    public Lion(String species, String habitat, boolean isNocturnal, int gestationPeriodInWeeks, float furDensity, float bodyTemperature, String maneColour, float roarVolume) {
        super(species, habitat, isNocturnal, gestationPeriodInWeeks, furDensity, bodyTemperature);
        this.maneColour = maneColour;
        this.roarVolume = roarVolume;
    }

    private void hunt(){

    }

    public String getManeColour() {
        return maneColour;
    }

    public float getRoarVolume() {
        return roarVolume;
    }

    public int getPrideSize() {
        return prideSize;
    }

    public void setPrideSize(int prideSize) {
        this.prideSize = prideSize;
    }

    public float getHuntingSuccessRate() {
        return huntingSuccessRate;
    }

    public void setHuntingSuccessRate(float huntingSuccessRate) {
        this.huntingSuccessRate = huntingSuccessRate;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    @Override
    public String showInfo() {
        return "Lion: {" + '\n' +
                "maneColour='" + maneColour + '\n' +
                ", roarVolume=" + roarVolume + '\n' +
                ", prideSize=" + prideSize + '\n' +
                ", huntingSuccessRate=" + huntingSuccessRate + '\n' +
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
