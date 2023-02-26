package Game.Unit;

public class Arrows extends UnitClass {

    protected int shot;

    public Arrows(String name, int hp, int maxHp, int defence, int damage, int minDamage, int maxDamage, int speed, int shot, int x, int y) {
        super(name, hp, maxHp, defence, damage, minDamage, maxDamage, speed, UnitClassType.Xbowman, x, y);
        this.shot=shot;
        
    }

    @Override
    public int compare() {
        
        return 0;
    }
    
}
