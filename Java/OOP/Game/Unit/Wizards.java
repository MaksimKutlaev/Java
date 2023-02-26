package Game.Unit;

public class Wizards extends UnitClass{

    protected int mana;

    public Wizards(String name, float hp, int maxHp, int defence, int damage, int minDamage, int maxDamage, int speed, int mana, int x, int y) {
        super(name, hp, maxHp, defence, damage, minDamage, maxDamage, speed, UnitClassType.Magican, x, y);
        this.mana=mana;
    }
    @Override
    public String getInfo() {
        return String.format("%s:\t %s\t Health: %f\t Speed: %d\t mana: %d\t posX: %d  posY: %d",
        this.unitType.getTitle(), this.name, this.hp, this.speed, this.mana, this.coords.x, this.coords.y);
    }
}
