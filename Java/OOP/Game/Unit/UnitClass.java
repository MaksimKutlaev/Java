package Game.Unit;

public abstract class UnitClass implements gameInterface {

    protected String name;
    protected int hp;
    protected int maxHp;
    protected int defence;
    protected int damage;

    public int Attack(int hp, int defence, int damage) {
        hp=hp+defence-damage;
        return hp;
    }

    public UnitClass (String name, int hp, int maxHp, int defence, int damage)
    {
        this.name=name;
        this.hp=hp;
        this.maxHp=maxHp;
        this.defence=defence;
        this.damage=damage;
    }

    @Override
    public void step() {
        
    }

    @Override
    public String getInfo() {
        
        return ("null");
    }
}
