package Game.Unit;

public class Warrior extends UnitClass {

    protected int hit;

    public Warrior(String name, float hp, int maxHp, int defence, int damage, int minDamage, int maxDamage, int speed, 
    int hit, UnitClassType type, int x, int y) {
        super(name, hp, maxHp, defence, damage, minDamage, maxDamage, speed, type, x, y);
        this.hit=hit;
        
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append(this.unitType.getTitle()+(":\t")).append(Warrior.super.name)
                .append("\t| ATK:\t").append(Warrior.super.damage)
                .append("\t| HP:\t").append(Warrior.super.hp)
                .append(" \t| Hit: ").append(Warrior.this.hit)
                .append("\t|").append("\t| (X.Y) : ").append(Warrior.super.coords.x).append(".").append(Warrior.super.coords.y);
    }

    // @Override
    // public String getInfo() {
    //     return String.format("%s:\t %s\t Health: %f\t Speed: %d\t hit: %d\t posX: %d  posY: %d",
    //     this.unitType.getTitle(), this.name, this.hp, this.speed, this.hit, this.coords.x, this.coords.y);
    // }

}
