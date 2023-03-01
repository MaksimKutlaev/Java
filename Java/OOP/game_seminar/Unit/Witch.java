package Unit;

public class Witch extends Mag{

    public Witch(String name, float hp, int maxHp, int attack, int damageMin, int damageMax,
                 int defense, int speed, int mana, int maxMana, int posX, int posY ) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, mana, maxMana, posX, posY);
    }
    public Witch(String name, Vector2D coords) {
        super(name, 50.f, 50, 9, -6, -6, 3,
                7, 5,5, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Witch.super.name)
                .append("\t| ATK:\t").append(Witch.super.attack)
                .append("\t| HP:\t").append(Witch.super.hp)
                .append(" \t| MP:\t").append(Witch.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Witch.super.coords.posX).append(".").append(Witch.super.coords.posY);
    }
}
