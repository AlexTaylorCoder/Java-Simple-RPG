import java.util.Hashtable;
import java.lang.reflect.*;

//Humanoid characters should same ability path as npcs
public class Mage extends Humanoid implements ClassAbilityStructure {

    Hashtable<String,Double> ratios = new Hashtable<String,Double>();
    Hashtable<String,Method> abilities = new Hashtable<String,Method>();

    Mage(String name,int mana, int health,int level) {
        super(name,mana,health,level);
        ratio_constructor();
    }

    Mage(String name) {
        super(name,120,80,1);
        ratio_constructor();
    }

    private void ratio_constructor() {
        ratios.put("mana",0.6);
        ratios.put("health",0.3);
        ratios.put("physical",0.2);
        ratios.put("magical",0.8);

        // abilities.put("Fireball",firstAbility());
        // abilities.put("Fireball",secondAbility());
        
    }
    @Override
    public double firstAbility() {
        System.out.println("You have casted a fireball!");
        return 5.1;
    }
    @Override
    public double secondAbility() {
        System.out.println("You have shot ice!");
        return 6.3;
    }
}
