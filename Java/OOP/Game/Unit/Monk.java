package Game.Unit;

public class Monk extends Wizards{

    public Monk(String name) {
        super(name, 200, 200, 70, 60, 200);
    }

    @Override
    public String getInfo() {
        return "Я Монах "+name;
    }
    @Override
    public void step() {
        
        super.step();
    }
    
}
