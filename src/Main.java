public class Main {
    public static void main(String[] args){
        Fire fire = new Fire("Charmander", 12, 27, "flamethrower", "male");
        Electric electric = new Electric("Pikachu", 24, 30, "thunderbolt", "female");
        Grass grass = new Grass("Bulbasaur", 11, 25, "vine whip", "female");
        Water water = new Water("Squirtle", 12, 59, "bubblebeam", "male");
        Water waterGrass = new Water("lotad", 4, 20, "tackle", "male")

        System.out.println("This Pokemon's name is " + fire.getName() + ", it is a " + fire.getGender() + " of level "
                + fire.getLevel() + ". " + fire.getName() + " weighs " + fire.getWeight() +
                "kg, and his favorite attack is " + fire.getAttack() + "! This Pokemon can evolve into " + fire.getEvolve()+
                " at level " + fire.getEvolvelevel() + ". Doe je aanval " + fire.getName() + "! ");
        fire.Attack();
        System.out.println("This Pokemon's name is " + electric.getName() + ", it is a " + electric.getGender() + " of level "
                + electric.getLevel() + ". " + electric.getName() + " weighs " + electric.getWeight() +
                "kg, and her favorite attack is " + electric.getAttack() + "!");
        electric.Attack();
        System.out.println("This Pokemon's name is " + water.getName() + ", it is a " + water.getGender() + " of level "
                + water.getLevel() + ". " + water.getName() + " weighs " + water.getWeight() +
                "kg, and her favorite attack is " + water.getAttack() + "!");
        water.Attack();
        System.out.println("This Pokemon's name is " + grass.getName() + ", it is a " + grass.getGender() + " of level "
                + grass.getLevel() + ". " + grass.getName() + " weighs " + grass.getWeight() +
                "kg, and her favorite attack is " + grass.getAttack() + "!");
        grass.Attack();
    }


}
