package Game.Unit;

public class Xbowman extends Arrows{

    public Xbowman(String name, Point coords) {
        super(name, 60, 60, 4, 7, 3, 7, 9, 10,20, UnitClassType.Xbowman, coords.x, coords.y);
        
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append(this.unitType.getTitle()+(":\t")).append(Xbowman.super.name)
                .append("\t| ATK:\t").append(Xbowman.super.damage)
                .append("\t| HP:\t").append(Xbowman.super.hp)
                .append(" \t| Arrows:").append(Xbowman.super.arrow)
                .append("\t|").append("\t| (X.Y) : ").append(Xbowman.super.coords.x).append(".").append(Xbowman.super.coords.y);
    }

}
