package Game.Unit;

public class Magican extends Wizards{

    public Magican(String name, Point coords) {
        super(name,30 , 30, 10, 12, -5, -5, 30, 1, coords.x, coords.y);
    }
    
    // @Override
    // public String getInfo() {
    //     return "Я Маг "+name;
    // }
    @Override
    public void step() {
        
        super.step();
    }
}
