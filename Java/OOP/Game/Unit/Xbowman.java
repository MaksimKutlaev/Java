package Game.Unit;

public class Xbowman extends Arrows{

    public Xbowman(String name) {
        super(name, 300, 300, 100, 70, 60);
        
    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик " + name;
    }
    @Override
    public void step() {
        
        super.step();
    }
    
}
