public class Shark extends Fish{
    private int teethCount;
    protected float finSize;
    protected float attackSpeed;
    public String sharkType;

    public Shark(String species, String habitat, boolean isNocturnal, String sharkType) {
        super(species, habitat, isNocturnal);
        this.sharkType = sharkType;
    }

    private void hunt(){
        System.out.println("Shark is hunting");
    }

    public int getTeethCount() {
        return teethCount;
    }

    public void setTeethCount(int teethCount) {
        this.teethCount = teethCount;
    }

    public float getFinSize() {
        return finSize;
    }

    public void setFinSize(float finSize) {
        this.finSize = finSize;
    }

    public float getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(float attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public String getSharkType() {
        return sharkType;
    }

    public void setSharkType(String sharkType) {
        this.sharkType = sharkType;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public String showInfo() {
        return "Shark: {" + '\n' +
                "teethCount=" + teethCount + '\n' +
                ", finSize=" + finSize + '\n' +
                ", attackSpeed=" + attackSpeed + '\n' +
                ", sharkType='" + sharkType + '\n' +
                ", gillCount=" + getGillCount() + '\n' +
                ", swimSpeed=" + swimSpeed + '\n' +
                ", depthRange=" + depthRange + '\n' +
                ", species='" + getSpecies() + '\n' +
                ", habitat='" + getHabitat() + '\n' +
                ", isNocturnal=" + isNocturnal() + '\n' +
                '}';
    }

    @Override
    public void feed() {

    }
}
