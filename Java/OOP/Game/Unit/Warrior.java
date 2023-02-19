package Game.Unit;

public class Warrior extends UnitClass {

    protected int hit;

    public Warrior(String name, int hp, int maxHp, int defence, int damage, int minDamage, int maxDamage, int speed, int hit) {
        super(name, hp, maxHp, defence, damage, minDamage, maxDamage, speed, UnitClassType.Spearman);
        this.hit=hit;
        
    }

    @Override
    public int compare() {
        
        return 0;
    }
    
}
