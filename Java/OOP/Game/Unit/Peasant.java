package Game.Unit;

public class Peasant extends UnitClass{

    int delivery;

    public Peasant(String name, Point coords) {
        super(name, 1, 1, 1, 1, 1, 1, 3, UnitClassType.Peasant, coords.x, coords.y);
        this.delivery=1;
        
    }


}
