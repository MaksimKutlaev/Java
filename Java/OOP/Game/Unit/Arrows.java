package Game.Unit;

public class Arrows extends UnitClass {

    protected int shot;

    public Arrows(String name, int hp, int maxHp, int defence, int damage, int shot) {
        super(name, hp, maxHp, defence, damage);
        this.shot=shot;
        
    }
    
}
