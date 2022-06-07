public abstract class Pokémon {
    private String name;
    private int level;
    private String type;
    private float weight;
    private  String attack;
    private String gender;
    private String evolve;
    private int evolvelevel;
    public Pokémon(String name, int level, float weight, String attack, String gender){
        this.name = name;
        this.level = level;
        this.weight = weight;
        this.attack = attack;
        this.gender = gender;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setEvolve(String evolve){
        this.evolve = evolve;
    }
    public void setEvolveLevel(int evolveLevel){
        this.evolvelevel = evolveLevel;
    }
    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public String getGender(){
        return gender;
    }
    public float getWeight(){
        return weight;
    }
    public String getAttack(){
        return attack;
    }
    public String getEvolve(){
        return evolve;
}
    public int getEvolvelevel(){
        return evolvelevel;
    }
    public void Attack(){
        System.out.println("ik doe een aanval");
    }
}
