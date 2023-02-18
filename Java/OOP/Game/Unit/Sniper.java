package Game.Unit;

public class Sniper extends Arrows{

    public Sniper(String name) {
        super(name, 15, 15, 10, 12, 8, 10, 9, 32);
        
    }
    
    @Override
    public String getInfo() {
        return "Я Снайпер "+name;
    }

    @Override
    public void step() {
        
        super.step();
    }
}
