package Game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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

        // ArrayList<UnitClass> list = new ArrayList<>();
        // list.add(new Xbowman(getName()));
        // list.add(new Sniper(getName()));
        // list.add(new Monk(getName()));
        // list.add(new Magican(getName()));
        // list.add(new Peasant(getName()));
        // list.add(new Rogue(getName()));
        // list.add(new Spearman(getName()));
        List<UnitClass> red = new ArrayList<>();
        List<UnitClass> blue = new ArrayList<>();
        int quantity;
        
        for (int index=0; index<10;index++){
            switch (new Random().nextInt(0,4)) {
                case 0:
                    red.add(new Magican(getName()));
                    break;
                case 1:
                    red.add(new Sniper(getName()));
                    break;
                case 2:
                    red.add(new Rogue(getName()));
                    break;
                case 3:
                    red.add(new Peasant(getName()));
                    break;
            }
        }
        red.sort (new Comparator<UnitClass>(){
            @Override
            public int compare(UnitClass o1, UnitClass o2) {
                if (o2.getSpeed()==o1.getSpeed()) return o2.getHP()-o1.getHP();
                
    
                return o2.getSpeed()- o1.getSpeed();
            }
        });
        // teamInfo(red);
        
        for (int index=0; index<10;index++){
            switch (new Random().nextInt(0,4)) {
                case 0:
                    blue.add(new Spearman(getName()));
                    break;
                case 1:
                    blue.add(new Xbowman(getName()));
                    break;
                case 2:
                    blue.add(new Monk(getName()));
                    break;
                case 3:
                    blue.add(new Peasant(getName()));
                    break;
            }
            
        }
        red.sort (new Comparator<UnitClass>(){
            @Override
            public int compare(UnitClass o1, UnitClass o2) {
                if (o2.getSpeed()==o1.getSpeed()) return o2.getHP()-o1.getHP();
                
    
                return o2.getSpeed()- o1.getSpeed();
            }
        });

        red.forEach(n->System.out.println(n.getInfo()));
        System.out.println();
        blue.forEach(n->System.out.println(n.getInfo()));
        
        

    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    // private static void  teamInfo(List<UnitClass> list) {
    //     return System.out.println(String.format("name: %s,hp: %d,speed: %d ", getName(), UnitClass.hp, this.speed));
    // }

    


}
