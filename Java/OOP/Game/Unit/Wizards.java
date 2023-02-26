package Game.Unit;

public class Wizards extends UnitClass{

    protected int mana;

    public Wizards(String name, int hp, int maxHp, int defence, int damage, int minDamage, int maxDamage, int speed, int mana, int x, int y) {
        super(name, hp, maxHp, defence, damage, minDamage, maxDamage, speed, UnitClassType.Magican, x, y);
        this.mana=mana;
    }


    @Override
    public int compare() {
        
        return 0;
    }

    
}
