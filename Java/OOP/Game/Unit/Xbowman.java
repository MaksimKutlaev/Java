package Game.Unit;

public class Xbowman extends Arrows{

    public Xbowman(String name, Point coords) {
        super(name, 10, 10, 3, 6, 2, 3, 10, 16, coords.x, coords.y);
        
    }

    // @Override
    // public String getInfo() {
    //     return "Я Арбалетчик " + name;
    // }
    @Override
    public void step() {
        
        super.step();
    }
    
}
