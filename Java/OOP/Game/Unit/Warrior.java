package Game.Unit;

public class Warrior extends UnitClass {

    protected int hit;

    public Warrior(String name, float hp, int maxHp, int defence, int damage, int minDamage, int maxDamage, int speed, int hit, int x, int y) {
        super(name, hp, maxHp, defence, damage, minDamage, maxDamage, speed, UnitClassType.Spearman, x, y);
        this.hit=hit;
        
    }

    @Override
    public String getInfo() {
        return String.format("%s:\t %s\t Health: %f\t Speed: %d\t hit: %d\t posX: %d  posY: %d",
        this.unitType.getTitle(), this.name, this.hp, this.speed, this.hit, this.coords.x, this.coords.y);
    }

}
