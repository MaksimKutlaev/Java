package Game.Unit;

public class Warrior extends UnitClass {

    protected int hit;

    public Warrior(String name, int hp, int maxHp, int defence, int damage, int minDamage, int maxDamage, int speed, int hit, int x, int y) {
        super(name, hp, maxHp, defence, damage, minDamage, maxDamage, speed, UnitClassType.Spearman, x, y);
        this.hit=hit;
        
    }

    @Override
    public int compare() {
        
        return 0;
    }
    
}
