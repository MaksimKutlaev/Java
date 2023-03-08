package Game.Unit;

import java.util.ArrayList;

public interface gameInterface {
    
    boolean step(ArrayList<UnitClass> team1, ArrayList<UnitClass> team2);
    StringBuilder getInfo();
    
    
}
