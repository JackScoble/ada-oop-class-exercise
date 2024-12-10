public abstract class Fish extends Animal {
    private int gillCount;
    protected float swimSpeed;
    protected float depthRange;

    public Fish(String species, String habitat, boolean isNocturnal) {
        super(species, habitat, isNocturnal);
    }

    public void layEggs(){
        System.out.println(this.getClass().getName() + " is laying eggs");
    }

    public int getGillCount() {
        return gillCount;
    }
}
