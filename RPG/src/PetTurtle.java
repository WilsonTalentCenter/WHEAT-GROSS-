/**
 * Created by al1280 on 4/27/2021.
 */
public class PetTurtle {
    private double health;
    private double defense;
    private double XP;
    private int level;
    private boolean potion;
    private double attack;
    private double Cannon;
    private double Squirellhealth;
    private double Squirelldamage;
    private double Squirelldefense;
    private double SquirellFlintlock;
    private int FlintlockAmmo;
    private int CannonAmmo;



    public PetTurtle(){
        health = 2;
        Squirellhealth = 30;
        defense = 2000;
        Squirelldefense = 15;
        XP = 0;
        level = 1;
        potion = false;
        attack = 711;
        SquirellFlintlock = 45;
        FlintlockAmmo = 15;
        Cannon = 20000;
        CannonAmmo = 15;

    }
}
//I've decided on something: PetTurtle is the only companion. THERE SHALL ONLY BE TINY TURTLE!
//And also the question of levelling up... Mainly what increments will be used to increase stats (excluding PetTurtle's defense, that shelled bastard is tanky enough as is)
//Side note: Give PetTurtle a Tank Cannon, because it is not enough for a 711 melee attack!
//I'll need help deciding on how much damage the Cannon will deal. And how big AoE will be.