package OOP.Unit;

public abstract class UnitClass {

    protected String name;
    protected int hp;
    protected int defence;
    protected int damage;

    public int Attack(int hp, int defence, int damage) {
        hp=hp+defence-damage;
        return hp;
    }

    public UnitClass (String name, int hp, int defence, int damage)
    {
        this.name=name;
        this.hp=hp;
        this.defence=defence;
        this.damage=damage;
    }
}
