public class Water extends Pokémon {
    private String bubbleBeam = "Bubble beam";
    private String attack;

    public Water(String name, int level, float weight, String attack, String gender){
        super(name, level, weight,attack, gender);
        super.setType("Water");
    }
    public void setAttack(String attack){
        this.attack = bubbleBeam;
    }
    public String getAttack(){
        return bubbleBeam;
    }
}