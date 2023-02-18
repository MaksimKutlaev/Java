package Game.Unit;

public class Peasant extends UnitClass{

    int delivery;

    public Peasant(String name) {
        super(name, 1, 1, 1, 1, 1, 1, 3);
        this.delivery=delivery;
        
    }

    @Override
    public String getInfo() {
        return "Я Крестьянин "+name;
    }
    @Override
    public void step() {
    
        super.step();
    }

    @Override
    public int compare() {
        
        return 0;
    }
    
}
