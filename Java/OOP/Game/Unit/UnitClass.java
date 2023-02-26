package Game.Unit;

import java.util.ArrayList;

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
    protected Point coords;
    protected String state;

    public UnitClass (String name, int hp, int maxHp, int defence, int damage, int minDamage, int maxDamage, 
    int speed, UnitClassType type, int x, int y)
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
        coords = new Point(x,y);
        state = "Stand";
    }


    protected int findNearest(ArrayList<UnitClass> team){
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDistance(team.get(i).coords)) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }

    @Override
    public void step() {
        
    }

    @Override
    public String getInfo() {
        
        return String.format("Я %s\t Name: %s\t Health: %d\t Speed: %d\t maxDamage: %d\t minDamage: %d",
        this.unitType.getTitle(), this.name, this.hp, this.speed, this.maxDamage, this.minDamage);
    }

    public void step(ArrayList<UnitClass> team1, ArrayList<UnitClass> team2) { }

    protected void getDamage(float damage){
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
        if (hp > maxHp) hp = maxHp;
    }

    public int getHP() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }



    
}
