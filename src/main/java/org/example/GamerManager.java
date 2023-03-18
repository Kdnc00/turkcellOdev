package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GamerManager {
    private EDevlet eDevlet;
    private ArrayList<Gamer>gamers;

    public GamerManager(EDevlet eDevlet) {
        this.eDevlet = eDevlet;

    }

   public boolean isVerify(Gamer gamer){
        boolean verify=eDevlet.verify(gamer);
            return verify;

   }
   public  void verifyInformation(Gamer gamer){
        if(isVerify(gamer)){
            System.out.println("Gamer is verify");
        }else{
            System.out.println("Not verify");
        }
   }
   public void registry(Gamer gamer){
        if(isVerify(gamer)){
            System.out.println("Gamer registry");
            gamers.add(gamer);
        }else{
            System.out.println("Gamer cannot registry");
        }
   }

   public void buy(Gamer gamer,Game game){
        if(gamer.getMoney()>=game.getPrice()){
            System.out.println("Bought successfuly" );
            gamer.setMoney(gamer.getMoney()-game.getPrice());


        }else{
            System.out.println("You dont have enough money");
        }

   }
}
