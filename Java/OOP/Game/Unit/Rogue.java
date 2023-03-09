package Game.Unit;

public class Rogue extends Warrior{

    public Rogue(String name, Point coords) {
        super(name, 40, 40, 3, 8, 2, 6, 6, 1, UnitClassType.Rogue, coords.x, coords.y);
    }
 

}
