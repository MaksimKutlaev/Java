package Game.Unit;

public class Magican extends Wizards{

    public Magican(String name) {
        super(name, 200, 200, 50, 90, 200);
    }
    
    @Override
    public String getInfo() {
        return "Я Маг "+name;
    }
    @Override
    public void step() {
        
        super.step();
    }
}
