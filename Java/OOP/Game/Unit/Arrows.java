package Game.Unit;

import java.util.ArrayList;

public class Arrows extends UnitClass {

    protected int shot;
    protected int arrow;

    public Arrows(String name, float hp, int maxHp, int defence, int damage, int minDamage, int maxDamage, int speed,
     int shot, int arrow, UnitClassType type,int x, int y) {
        super(name, hp, maxHp, defence, damage, minDamage, maxDamage, speed, type, x, y);
        this.shot=shot;
        this.arrow=arrow;
        
    }

    @Override
    public void step(ArrayList<UnitClass> team1, ArrayList<UnitClass> team2) {
        if (state.equals("Die") || arrow == 0) return;
        UnitClass victim = team2.get(findNearest(team2));
        // int a = boolean ? first : second;
        float attack = (victim.defence - damage)>0 ? minDamage : (victim.defence - damage)<0 ? maxDamage : (minDamage+maxDamage)/2;
        victim.getDamage(attack);
        for (UnitClass unit: team1) {
            if (unit.getInfo().toString().split(":")[0].equals("Крестьянин") && unit.state.equals("Stand")) {
                unit.state = "Busy";
                return;
            }
            System.out.println(unit.getInfo().toString().split(":")[0]);
        }
        arrow--;
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + defence +
                " A:" + damage +
                " Dmg:" + Math.round(Math.abs((minDamage+maxDamage)/2)) +
                " Shots:" + arrow + " " +
                state;
    }


    // @Override
    // public StringBuilder getInfo() {
    //     // TODO Auto-generated method stub
    //     return super.getInfo();
    // }
    // @Override
    // public String getInfo() {
        
    //     return String.format("%s:\t %s\t Health: %f\t Speed: %d\t Arrow: %d\t posX: %d  posY: %d",
    //     this.unitType.getTitle(), this.name, this.hp, this.speed, this.arrow, this.coords.x, this.coords.y);
    // }

  
    
}
