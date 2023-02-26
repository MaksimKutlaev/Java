package Game.Unit;

public class Peasant extends UnitClass{

    int delivery;

    public Peasant(String name, Point x, Point y) {
        super(name, 1, 1, 1, 1, 1, 1, 3, UnitClassType.Peasant, 0,0);
        this.delivery=delivery;
        
    }

    // @Override
    // public String getInfo() {
    //     return "Я Крестьянин "+name;
    // }
    @Override
    public void step() {
    
        super.step();
    }

    @Override
    public int compare() {
        
        return 0;
    }
    
}
