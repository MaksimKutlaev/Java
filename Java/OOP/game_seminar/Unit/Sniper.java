package Unit;

public class Sniper extends Shooter{
    public Sniper(String name, Vector2D coords) {
        super(name, 60.f, 60, 10, 3, 5, 3,
                9, 22, 10, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attack)
                .append("\t| HP:\t").append(Sniper.super.hp)
                .append(" \t| Arrows:").append(Sniper.super.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.coords.posX).append(".").append(Sniper.super.coords.posY);
    }
}