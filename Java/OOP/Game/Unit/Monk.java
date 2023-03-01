package Game.Unit;

public class Monk extends Wizards{

    public Monk(String name, Point coords) {
        super(name, 50, 50, 7, 10, -7, -7, 5, 5, UnitClassType.Monk, coords.x, coords.y);
    }


}
