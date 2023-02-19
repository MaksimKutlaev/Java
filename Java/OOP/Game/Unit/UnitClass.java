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

    public UnitClass (String name, int hp, int maxHp, int defence, int damage, int minDamage, int maxDamage, int speed)
    {
        this.name=name;
        this.hp=hp;
        this.maxHp=maxHp;
        this.defence=defence;
        this.damage=damage;
        this.minDamage=minDamage;
        this.maxDamage=maxDamage;
        this.speed=speed;
    }

    @Override
    public void step() {
        
    }

    @Override
    public String getInfo() {
        
        return String.format("Hero: %s Name: %s Health: %d Speed: %d, maxDamage: %d, minDamage: %d",
        this.name, this.hp, this.speed, this.maxDamage, this.minDamage, this.getClass().getSimpleName());
    }

    public int getHP() {
        return 0;
    }

    public int getSpeed() {
        return speed;
    }

   

    // public int compare(UnitClass o1,UnitClass o2){
    //     return o1.getSpeed().compareTo(o2.getSpeed());
    // }

    
}
