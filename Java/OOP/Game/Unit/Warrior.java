package Game.Unit;

import java.util.ArrayList;

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

    @Override
    public boolean step(ArrayList<UnitClass> team1, ArrayList<UnitClass> team2) {
        if (state.equals("Die"))
            return true;
        UnitClass victim = team2.get(findNearest(team2));
        if (victim.coords.getDistance(coords) < 2) {
            float attack = (victim.defence - damage) > 0 ? minDamage
                    : (victim.defence - damage) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
            victim.getDamage(attack);
        } else {
            Point tempvc = coords.chooseWay(victim.coords);
            if (Math.abs(tempvc.x) < Math.abs(tempvc.y)) {
                if (coords.chooseWay(victim.coords).y > 0) {
                    coords.y--;
                } else {
                    coords.y++;
                }
            } else {
                if (coords.chooseWay(victim.coords).x > 0) {
                    coords.x--;
                } else {
                    coords.x++;
                }
            }
        }
        return false;
    }

    // @Override
    // public String getInfo() {
    //     return String.format("%s:\t %s\t Health: %f\t Speed: %d\t hit: %d\t x: %d  y: %d",
    //     this.unitType.getTitle(), this.name, this.hp, this.speed, this.hit, this.coords.x, this.coords.y);
    // }

}
