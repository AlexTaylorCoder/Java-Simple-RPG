public class Humanoid extends Entity {
    String name;
    
    Humanoid(String name,int mana, int health,int level) {
        super(mana,health,level);
        this.name = name;
    }

    
}
