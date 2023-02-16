package Game;

import java.util.ArrayList;
import java.util.Random;

import Game.Unit.Magican;
import Game.Unit.Monk;
import Game.Unit.Peasant;
import Game.Unit.Rogue;
import Game.Unit.Sniper;
import Game.Unit.Spearman;
import Game.Unit.UnitClass;
import Game.Unit.Xbowman;

public class game {
    public static void main(String[] args){

        ArrayList<UnitClass> list = new ArrayList<>();
        list.add(new Xbowman(getName()));
        list.add(new Sniper(getName()));
        list.add(new Monk(getName()));
        list.add(new Magican(getName()));
        list.add(new Peasant(getName()));
        list.add(new Rogue(getName()));
        list.add(new Spearman(getName()));



        list.forEach(n->System.out.println(n.getInfo()));
        
    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }


}
