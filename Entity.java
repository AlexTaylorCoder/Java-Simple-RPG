public class Entity {  
    int mana;
    int health;
    int level;
    int points;
      
    Entity(int mana, int health,int level) {
        this.mana = mana;
        this.health = health;
        this.level = level;
        this.points = 0;
    }
    Entity() {
        this.mana = 100;
        this.health = 100;
        this.level = 1;
    }
    void levelup() {
        this.level ++ ;
        this.points += 3;
    }

}