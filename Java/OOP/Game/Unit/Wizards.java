package Game.Unit;

public class Wizards extends UnitClass{

    protected int mana;

    public Wizards(String name, int hp, int maxHp, int defence, int damage, int mana) {
        super(name, hp, maxHp, defence, damage);
        this.mana=mana;
    }

    
}
