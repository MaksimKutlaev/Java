package Game.Unit;

public class Rogue extends Warrior{

    public Rogue(String name) {
        super(name, 300, 300, 70, 80, 90);
    }
 
    @Override
    public String getInfo() {
        return "Я Разбойник "+name;
    }
    @Override
    public void step() {
        
        super.step();
    }
}
