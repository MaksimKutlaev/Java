package Game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Game.Unit.Magican;
import Game.Unit.Monk;
import Game.Unit.Peasant;
import Game.Unit.Point;
import Game.Unit.Rogue;
import Game.Unit.Sniper;
import Game.Unit.Spearman;
import Game.Unit.UnitClass;
import Game.Unit.Xbowman;

public class game {
    public static void main(String[] args){ 
        
        ArrayList<UnitClass> red = new ArrayList<>();
        ArrayList<UnitClass> blue = new ArrayList<>();
        ArrayList<UnitClass> allTeam = new ArrayList<>();
        Scanner user_input = new Scanner(System.in);
        createTeam(red, 0, 1);
        createTeam(blue, 3, 10);
        allTeam.addAll(red);
        allTeam.addAll(blue);
        sortArmy(allTeam);
        allTeam.forEach(n->System.out.println(n.getInfo()));
        System.out.println();

        String stop = "";
        while (stop.equals("")) {
            for (UnitClass unit : allTeam) {
                if (red.contains(unit)) unit.step(red, blue);
                else unit.step(blue, red);
            }
            allTeam.forEach(n -> System.out.println(n.getInfo()));
            stop = user_input.nextLine();
        }
        // System.out.println();
        // // red.forEach(n->System.out.println(n.getInfo()));
        // // System.out.println();
        // // blue.forEach(n->System.out.println(n.getInfo())); 

    }
        static void createTeam(ArrayList<UnitClass> team, int side, int posY){

        for (int index=0; index<10;index++){
            switch (new Random().nextInt(4)+side) {
                case 0:
                    team.add(new Magican(getName(), new Point(index+1, posY)));
                    break;
                case 1:
                    team.add(new Sniper(getName(), new Point(index+1, posY)));
                    break;
                case 2:
                    team.add(new Rogue(getName(), new Point(index+1, posY)));
                    break;
                case 3:
                    team.add(new Peasant(getName(),new Point(index+1, posY)));
                    break;
                case 4:
                    team.add(new Spearman(getName(), new Point(index+1, posY)));
                    break;
                case 5:
                    team.add(new Xbowman(getName(), new Point(index+1, posY)));
                    break;
                case 6:
                    team.add(new Monk(getName(), new Point(index+1, posY)));
                    break;
            }
            }
        }

        static void sortArmy(ArrayList<UnitClass> team){
            team.sort(new Comparator<UnitClass>(){
            @Override
            public int compare(UnitClass o1, UnitClass o2){
                if (o2.getSpeed()==o1.getSpeed()) return (int) (o2.getHP()-o1.getHP());               
                return o2.getSpeed()- o1.getSpeed();
            }
            
        });
    }

        private static String getName(){
            return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        }

    }
      
 
    





    
  // red.sort (new Comparator<UnitClass>(){
        //     @Override
        //     public int compare(UnitClass o1, UnitClass o2) {
        //         if (o2.getSpeed()==o1.getSpeed()) return o2.getHP()-o1.getHP();
        //         return o2.getSpeed()- o1.getSpeed();
        //     }
        // });

        // blue.sort (new Comparator<UnitClass>(){
        //     @Override
        //     public int compare(UnitClass o1, UnitClass o2) {
        //         if (o2.getSpeed()==o1.getSpeed()) return o2.getHP()-o1.getHP();               
        //         return o2.getSpeed()- o1.getSpeed();
        //     }
        // });
