package Game.Unit;

import java.util.ArrayList;

public class Peasant extends UnitClass{

    int arrow;

    public Peasant(String name, Point coords) {
        super(name, 30, 30, 1, 1, 1, 1, 3, UnitClassType.Peasant, coords.x, coords.y);
        this.arrow=1;
        
    }

    @Override
    public boolean step(ArrayList<UnitClass> team1, ArrayList<UnitClass> team2) {
        if (!state.equals("Die")) {state = "Stand"; return false;}
        else return true;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append(this.unitType.getTitle()+(":\t")).append(Peasant.super.name)
                .append("\t| ATK:\t").append(Peasant.super.damage)
                .append("\t| HP:\t").append(Peasant.super.hp)
                .append(" \t| Arrows: ").append(Peasant.this.arrow)
                .append("\t|").append("\t| (X.Y) : ").append(Peasant.super.coords.x).append(".").append(Peasant.super.coords.y);
    }
}
