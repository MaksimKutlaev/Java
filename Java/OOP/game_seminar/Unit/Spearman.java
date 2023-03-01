package Unit;
public class Spearman extends Warrior {
    public Spearman(String name, Vector2D coords) {
        super(name, 70.f, 70, 10, 2, 4, 10,
                6, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик:\t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.coords.posX).append(".").append(Spearman.super.coords.posY);
    }
}
