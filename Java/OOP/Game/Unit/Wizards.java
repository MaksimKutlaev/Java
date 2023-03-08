package Game.Unit;

import java.util.ArrayList;

public class Wizards extends UnitClass{

    protected int mana;

    public Wizards(String name, float hp, int maxHp, int defence, int damage, int minDamage, int maxDamage, int speed, 
    int mana, UnitClassType type, int x, int y) {
        super(name, hp, maxHp, defence, damage, minDamage, maxDamage, speed, type, x, y);
        this.mana=mana;
    }

    @Override
    public boolean step(ArrayList<UnitClass> team1, ArrayList<UnitClass> team2) {
        for (UnitClass unit: team1) {
            if (unit.hp < unit.maxHp & !unit.state.equals("Die")) {
                unit.getDamage(maxDamage);
                return false;
            }
        }
        return true;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append(this.unitType.getTitle()+(":\t")).append(Wizards.super.name)
                .append("\t| ATK:\t").append(Wizards.super.damage)
                .append("\t| HP:\t").append(Wizards.super.hp)
                .append(" \t| Mana: ").append(Wizards.this.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Wizards.super.coords.x).append(".").append(Wizards.super.coords.y);
    }
    // @Override
    // public String getInfo() {
    //     return String.format("%s:\t %s\t Health: %f\t Speed: %d\t mana: %d\t posX: %d  posY: %d",
    //     this.unitType.getTitle(), this.name, this.hp, this.speed, this.mana, this.coords.x, this.coords.y);
    // }
}
