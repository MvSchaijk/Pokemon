public class Electric extends Pokémon{
    private String thunderbolt = "thunderbolt";
    private String attack;

    public Electric(String name, int level, float weight, String attack, String gender){
        super(name, level, weight,attack, gender);
        super.setType("Electric");
}
    public void setAttack(String attack){
        this.attack = thunderbolt;
    }
    public String getAttack(){
        return thunderbolt;
    }
    @Override
    public void Attack(){
        System.out.println("ik doe een " + thunderbolt);
    }
}
