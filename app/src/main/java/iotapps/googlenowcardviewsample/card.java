package iotapps.googlenowcardviewsample;

import static android.R.attr.description;

/**
 * Created by prashantkaushik on 07/02/17.
 */

public class card {

    private String cardtitle;
    private  String cardheadertitle;
    private String carddetails;
    private int cardsideimage;
    private int cardleftthumbnail;
    private int optiondots;


    public String getCardheadertitle() {
        return cardheadertitle;
    }



    public String getCarddetails() {
        return carddetails;
    }

    public void setCarddetails(String carddetails) {
        this.carddetails = carddetails;
    }

    public int getCardsideimage() {
        return cardsideimage;
    }


    public void setCardheadertitle(String cardheadertitle) {
        this.cardheadertitle = cardheadertitle;
    }

    public void setCardsideimage(int cardsideimage) {
        this.cardsideimage = cardsideimage;
    }

    public int getCardleftthumbnail() {
        return cardleftthumbnail;
    }

    public void setCardleftthumbnail(int cardleftthumbnail) {
        this.cardleftthumbnail = cardleftthumbnail;
    }

    public int getOptiondots() {
        return optiondots;
    }

    public void setOptiondots(int optiondots) {
        this.optiondots = optiondots;
    }

    public card(String carddetails,String cardheadertitle, String cardtitle, int cardleftthumbnail,int cardsideimage, int optiondots )
    {
        this.carddetails = carddetails;
        this.cardheadertitle = cardheadertitle;
        this.cardtitle = cardtitle;

        this.cardleftthumbnail = cardleftthumbnail;
        this.cardsideimage = cardsideimage;
        this.optiondots = optiondots;


    }

    public card()
    {

    }

    public String getCardtitle() {
        return cardtitle;
    }

    public void setCardtitle(String cardtitle) {
        this.cardtitle = cardtitle;
    }
}
