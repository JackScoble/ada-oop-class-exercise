public abstract class Animal {
    private int energyLevel;
    private int hungerLevel;
    private final boolean isNocturnal;

    protected String species;
    protected String habitat;

    public Animal(String species, String habitat, boolean isNocturnal){
        this.species = species;
        this.habitat = habitat;
        this.isNocturnal = isNocturnal;
        this.energyLevel = 5;
        this.hungerLevel = 5;
    }

    private void eat(){
        if(hungerLevel < 10){
            System.out.println(this.getClass().getName() + " is eating");
            hungerLevel += 1;
        }
    }

    private void sleep(String timeOfDay){
        if(isNocturnal && timeOfDay.equals("night")) return;
        if(!isNocturnal && timeOfDay.equals("day")) return;
        System.out.println(this.getClass().getName() + " is sleeping");
        if(energyLevel < 10){
            energyLevel += 1;
        }
    }

    private void breathe(){
        System.out.println(this.getClass().getName() + " is breathing");
    }

    protected void move(){
        if(energyLevel > 0){
            energyLevel -= 1;
        }
        System.out.println(this.getClass().getName() + " is moving");
    }
    protected void grow(){
        System.out.println(this.getClass().getName() + " is growing");
    }

    public abstract void makeSound();
    public abstract String showInfo();
    public abstract void feed();

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public boolean isNocturnal() {
        return isNocturnal;
    }

    public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }
}
