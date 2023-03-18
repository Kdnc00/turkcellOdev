package org.example;

public class Game {
    private int id;
    private String gameName;
    private double price;
    private Campaign campaign;

    public Game(int id, String gameName, double price) {
        this.id = id;
        this.gameName = gameName;
        this.price = price;

    }
    public void campaignCalculator(Campaign campaign){

        this.setCampaign(campaign );
        this.setPrice(this.price-(this.price*(campaign.getCampaignDiscount()/100)));
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", gameName='" + gameName + '\'' +
                ", price=" + price +
                '}';
    }
}
