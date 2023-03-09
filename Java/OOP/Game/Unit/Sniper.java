package Game.Unit;

public class Sniper extends Arrows{

    public Sniper(String name, Point coords) {
        super(name, 60, 60, 3, 10, 3, 7, 9, 10,22, UnitClassType.Sniper, coords.x, coords.y);
        
    }
    

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append(this.unitType.getTitle()+(":\t")).append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.damage)
                .append("\t| HP:\t").append(Sniper.super.hp)
                .append(" \t| Arrows: ").append(Sniper.this.arrow)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.coords.x).append(".").append(Sniper.super.coords.y);
    }

}
