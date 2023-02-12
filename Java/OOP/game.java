package OOP;

import OOP.Unit.Magican;
import OOP.Unit.Monk;
import OOP.Unit.Peasant;
import OOP.Unit.Rogue;
import OOP.Unit.Sniper;
import OOP.Unit.Spearman;
import OOP.Unit.Xbowman;

public class game {
    public static void main(String[] args){
        Xbowman Robin = new Xbowman("Robin");
        Peasant Jim = new Peasant("Jim");
        Sniper Paul = new Sniper("Paul");
        Magican Bald = new Magican("Bald");
        Monk Sif = new Monk("Sif");
        Spearman Gross = new Spearman("Gross");
        Rogue Minas = new Rogue("Minas");
        

        System.out.println(Robin.Attack(100, 20, 50));
        
    }
}
