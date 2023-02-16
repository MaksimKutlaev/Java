package Game.Unit;

public class Sniper extends Arrows{

    public Sniper(String name) {
        super(name, 300, 300, 100, 60, 50);
        
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
