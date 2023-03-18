package org.example;

public class CampaignManager {
    private Game [] games;

    public CampaignManager(Game[] games) {
     this.games=games;
    }

   public void addCampaign(Campaign campaign,int gameId){
       for (Game game : games) {
           if(game.getId() == gameId){
               game.campaignCalculator(campaign);
           }

       }
   }
    public void removeCampaign(Campaign campaign,int gameId){
        for (Game game : games) {
            if(game.getId() == gameId){
               campaign.setCampaignDiscount(0);
            }

        }
    }
    public void updateCampaign(Campaign campaign,int gameId){
        for (Game game : games) {
            if(game.getId() == gameId){
                game.campaignCalculator(campaign);
            }

        }
    }

}
