package Game.Unit;

import java.util.ArrayList;

public interface gameInterface {
    
    void step(ArrayList<UnitClass> team1, ArrayList<UnitClass> team2);
    StringBuilder getInfo();
    
    
}
