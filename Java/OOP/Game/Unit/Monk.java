package Game.Unit;

public class Monk extends Wizards{

    public Monk(String name, Point coords) {
        super(name, 30, 30, 7, 21, -4, -4, 5, 1, coords.x, coords.y);
    }

    // @Override
    // public String getInfo() {
    //     return "Я Монах "+name;
    // }
    @Override
    public void step() {
        
        super.step();
    }
    
}
