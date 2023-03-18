package org.example;

public class Main {
    public static void main(String[] args) {
       GamerManager gamerManager=new GamerManager(new EDevlet());
       gamerManager.registry(DataBase.gamer1);

    }
}