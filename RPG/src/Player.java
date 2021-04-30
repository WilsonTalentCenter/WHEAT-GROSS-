/**
 * Created by al1280 on 4/27/2021.
 */
public class Player {
private double health;
private double defense;
private double attack;
private int level;
private double PlayerXP;
private int potions;
private int gold;
private int invspace;

public Player(){
    this.level = 1;
    health = 25;
    defense = 8;
    attack = 15;
    potions = 3;
    gold = 0;
    PlayerXP = 0;
    invspace = 20;
}
private double getHealth(){return health;}
private double getDefense(){return defense;}
private double getAttack(){return attack;}
private int getLevel(){return level;}
private double getPlayerXP(){return PlayerXP;}
private int getPotions(){return potions;}
private int getGold(){return gold;}




}
/**public void menu(Enemy enemy){
 * Scanner console = new Scanner(System.in);
 * while (true) {
 *     System.out.println("What will you do? Fight, heal, or stat check?")
 *
 *     String answer = console.nextLine();
 *     if(answer.equalsIgnoreCase("heal")){
 *          heal(); Side note: there will be a heal function
 *     }
 *     else if (answer.equalsIgnoreCase("attack")){
 *         return; } exits and deals damage
 *         else if(answer.equalsIgnoreCase("stats")){
 *             System.out.println("Your stats:");
 *             System.out.println("level: "+ getLevel());
 *             System.out.println("health: "+ getHealth());
 *             System.out.println("attack: "+ getAttack());
 *             System.out.println("defense: "+getDefense());
 *             System.out.println("potions: "+getPotions());
 *             System.out.println("PlayerXP: "+getPlayerXP());
 *             System.out.println("Gold: "+getGold());
 *             System.out.println("");
 *             System.out.println("Party Stats:)
 *             you get the idea
 *             }
 *             public boolean takeDamage(Enemy enemy){
 *                 double damage = (enemy.getAttack()) - defense;
 *
 *                 health = health - damage;
 *                 System.out.println("the enemy attacked you and you took" +damage+ "damage!")
 *                 if(isAlive()){
 *                     return true;
 *                 }
 *                 System.out.println("By the power of "+enemyName+", you are slain!");
 *                 return false;
 *             }
 *           public boolean isAlive(){
 *               return (health>0);
 *           }
 *
 *           private void heal(){
 *               if (Potions >0){
 *                   Potions--
 *                   health = health + 25
 *                   System.out.println("you ingested a liquid of restoration, and now have" +health+ "health")
 *               }
 *               else{
 *                   System.out.println("Looking at the potion pouch, you seem to find yourself lacking in potions... Guess it's just a pouch.");
 *               }
 *           }
 *         }
 * }
 * keep in mind that even though the bracket one line above is connected to the function, some of this code might not be apart of it.
 */

