package Game.Unit;

public class Monk extends Wizards{

    public Monk(String name, Point coords) {
        super(name, 30, 30, 7, 10, -5, -5, 5, 5, UnitClassType.Monk, coords.x, coords.y);
    }


}
