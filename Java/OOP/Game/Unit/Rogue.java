package Game.Unit;

public class Rogue extends Warrior{

    public Rogue(String name, Point coords) {
        super(name, 10, 10, 3, 8, 2, 4, 6, 1, coords.x, coords.y);
    }
 
    // @Override
    // public String getInfo() {
    //     return "Я Разбойник "+name;
    // }
    @Override
    public void step() {
        
        super.step();
    }
}
