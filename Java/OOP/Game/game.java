package Game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import Game.Unit.*;


public class game {
    static final int UNITS = 10;
    public static ArrayList<UnitClass> allTeam = new ArrayList<>();
    public static ArrayList<UnitClass> green = new ArrayList<>();
    public static ArrayList<UnitClass> blue = new ArrayList<>();

    public static void main(String[] args){ 
        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();
        createTeam(green, 0, 1);
        createTeam(blue, 3, 10);
        // System.out.println("GREEN");
        // green.forEach(n->System.out.println(n.getInfo()));
        // System.out.println("BLUE");
        // blue.forEach(n->System.out.println(n.getInfo()));
        allTeam.addAll(green);
        allTeam.addAll(blue);
        sortArmy(allTeam);
        boolean a = true;
        int countBlue=0;
        int countGreen=0;
        // System.out.println("Sort to speed");
        // allTeam.forEach(n->System.out.println(n.getInfo()));
        // System.out.println();

        while (a){
            View.view();
            user_input.nextLine();
            countBlue =0;
            countGreen=0;
            for (UnitClass unit: allTeam) {
                if (green.contains(unit)) {
                    if  (unit.step(green, blue))
                    countBlue++;
                }
                else {
                if ((unit.step(blue, green)))
                    countGreen++;

                };
            }
            if (countBlue==UNITS||countGreen==UNITS)
            a=false;
        }
        if (countGreen==UNITS)
            System.out.println("GREEN TEAM WINS!");
        else {
            System.out.println("BLUE TEAM WINS!");
        }
    }



static void createTeam(ArrayList<UnitClass> team, int side, int posY){

        for (int index=0; index<UNITS;index++){
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
      
 
    





    
  // green.sort (new Comparator<UnitClass>(){
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
