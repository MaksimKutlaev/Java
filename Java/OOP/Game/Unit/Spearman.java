package Game.Unit;

public class Spearman extends Warrior{

    public Spearman(String name) {
        super(name, 10, 10, 5, 4, 1, 3, 4, 1);
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
