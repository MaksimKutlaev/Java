package Game.Unit;

public class Spearman extends Warrior{

    public Spearman(String name) {
        super(name, 400, 400, 120, 75, 90);
    }
    
    @Override
    public String getInfo() {
        return "Я Копейщик "+name;
        
    }
    @Override
    public void step() {
    
        super.step();
    }
}
