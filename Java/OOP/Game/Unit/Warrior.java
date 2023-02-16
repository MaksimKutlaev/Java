package Game.Unit;

public class Warrior extends UnitClass {

    protected int hit;

    public Warrior(String name, int hp, int maxHp, int defence, int damage, int hit) {
        super(name, hp, maxHp, defence, damage);
        this.hit=hit;
        
    }
    
}
