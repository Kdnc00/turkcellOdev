package org.example;

public class Campaign {
    private int id;
    private String campaignName;
    private double campaignDiscount;
    private Game game;

    public Campaign(int id, String campaignName, double campaignDiscount,Game game) {
        this.id = id;
        this.game=game;
        this.campaignName = campaignName;
        this.campaignDiscount = campaignDiscount;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getCampaignDiscount() {
        return campaignDiscount;
    }

    public void setCampaignDiscount(double campaignDiscount) {
        this.campaignDiscount = campaignDiscount;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "id=" + id +
                ", campaignName='" + campaignName + '\'' +
                ", campaignDiscount=" + campaignDiscount +
                ", gamer=" + game +
                '}';
    }
}

