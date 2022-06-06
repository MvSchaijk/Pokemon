public class Fire extends Pokémon{
private String flamethrower = "flamethrower";
private String ember = "ember";
private String attack;
private String evolve;
private String charmeleon = "Charmeleon";
private int evolvelevel;

public Fire(String name, int level, float weight, String attack, String gender){
    super(name, level, weight, attack, gender);
    super.setType("Fire");
    super.setEvolve("charmeleon");
    super.setEvolveLevel(16);
}
public void setAttack(String attack){
    this.attack = attack;
}

public void setEvolve(String evolve){
    this.evolve = evolve;
}




}
