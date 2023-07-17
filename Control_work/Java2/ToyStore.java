package OOP_Java.Toy;

import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.Random;


public class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizeToys;
    private File prizeFile;

    public ToyStore(){
        toys=new ArrayList<>();
        prizeToys=new ArrayList<>();
        prizeFile=new File("prize toys.txt");
    }

    public void addToy(Toy toy){
        toys.add(toy);
    }

    public void updateWeight(int id, int weight){
        for (Toy toy:toys){
            if(toy.getId()==id){
                ((Toy) toys).setWeight(weight);
            }
        }
    }

    public void drawPrize(){
        Random rand = new Random();
        int totalWeight=0;

        for (Toy toy:toys){
            totalWeight+=toy.getWeight();
        }
        int randomNum=rand.nextInt(totalWeight);

        for (Toy toy:toys){
            if (randomNum<toy.getWeight()){
                prizeToys.add(toy);
                toy.decrementQuantity();
                break;
            }

            randomNum-=toy.getWeight();
        }
    }

    public void savePrizeToFile(){
        try{
            FileWriter writer=new FileWriter(prizeFile);

            for (Toy toy:prizeToys){
                writer.write(toy.getName()+"\n");
            }

            writer.close();
            prizeToys.clear();
        } catch (IOException e){
            e.printStackTrace();
        }   
     }
     
     public void printToys(){
        System.out.println("Toys in stock:");
        for (Toy toy:toys){
            System.out.println(toy.getId()+" - "+toy.getName()+" - "+toy.getQuantity()+" - "+toy.getWeight()+"%");
        }
    }

    public void printPrizeToys(){
        System.out.println("Prize tpys:");
        for (Toy toy:prizeToys){
            System.out.println(toy.getId()+" - "+toy.getName());
        }
    }
    public void removeToy(int id){
        for (int i=0; i<toys.size(); i++){
            if (toys.get(i).getId()==id) {
                toys.remove(i);
                break;
            }
        }
    }
}
