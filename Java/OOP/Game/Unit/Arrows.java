package Game.Unit;

public class Arrows extends UnitClass {

    protected int shot;

    public Arrows(String name, int hp, int maxHp, int defence, int damage, int minDamage, int maxDamage, int speed, int shot) {
        super(name, hp, maxHp, defence, damage, minDamage, maxDamage, speed);
        this.shot=shot;
        
    }

    @Override
    public int compare() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
