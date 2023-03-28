import java.util.Hashtable;
public class Warrior extends Humanoid implements ClassAbilityStructure {

    Hashtable<String,Double> ratios = new Hashtable<String,Double>();

    //Custom Warrior
    Warrior(String name,int mana, int health,int level) {
        super(name,mana,health,level);
        ratio_constructor();

    }
    //Default values for new user
    Warrior(String name) {
        super(name,80,120,1);
        ratio_constructor();

    }
    private void ratio_constructor() {
        ratios.put("mana",0.4);
        ratios.put("health",0.6);
        ratios.put("physical",0.8);
        ratios.put("magical",0.2);
    }
    @Override
    public double firstAbility() {
        System.out.println("You have thrust your sword!");
        return 4.52;
    }
    @Override
    public double secondAbility() {
        System.out.println("You have slashed your sword!");
        return 4.52;
    }
}
