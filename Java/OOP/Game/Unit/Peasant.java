package Game.Unit;

public class Peasant extends UnitClass{

    public Peasant(String name) {
        super(name, 100, 100, 30, 10);
        
    }

    @Override
    public String getInfo() {
        return "Я Крестьянин "+name;
    }
    @Override
    public void step() {
        // TODO Auto-generated method stub
        super.step();
    }
    
}
