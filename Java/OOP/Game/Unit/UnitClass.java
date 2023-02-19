package Game.Unit;


public abstract class UnitClass implements gameInterface {

    protected String name;
    protected int hp;
    protected int maxHp;
    protected int defence;
    protected int damage;
    protected int minDamage;
    protected int maxDamage;
    protected int speed;
    protected UnitClassType unitType;

    public UnitClass (String name, int hp, int maxHp, int defence, int damage, int minDamage, int maxDamage, int speed, UnitClassType type)
    {
        this.name=name;
        this.hp=hp;
        this.maxHp=maxHp;
        this.defence=defence;
        this.damage=damage;
        this.minDamage=minDamage;
        this.maxDamage=maxDamage;
        this.speed=speed;
        this.unitType=type;
    }

    @Override
    public void step() {
        
    }

    @Override
    public String getInfo() {
        
        return String.format("Я %s Name: %s Health: %d Speed: %d, maxDamage: %d, minDamage: %d",
        this.unitType.getTitle(), this.name, this.hp, this.speed, this.maxDamage, this.minDamage);
    }

    public int getHP() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }


    
}