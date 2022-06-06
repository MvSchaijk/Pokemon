public class Grass extends Pokémon{
    private String vineWhip = "vine whip";
    private String attack;

    public Grass(String name, int level, float weight, String attack, String gender){
        super(name, level, weight,attack, gender);
        super.setType("Grass");
    }
    public void setAttack(String attack){
        this.attack = vineWhip;
    }
    public String getAttack(){
        return vineWhip;
    }
}