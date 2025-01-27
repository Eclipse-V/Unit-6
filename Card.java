public class Card{
    private String rank;
    private String suit;
    private int pointValue;

    //constructor
    public Card(String rank, String suit, int pointValue){
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    // accessor methods 
    public String getRank(){
        return rank;
    }

    public String getSuit(){
        return suit;
    }

    public int getPointValue(){
        return pointValue;
    }

    //boolean method that determines if two cards are equal
    public boolean equals(Card c){
        if(this.rank.equals(c.rank) && this.suit.equals(c.suit) && this.pointValue == c.pointValue){
            return true;
        }
            return false;

    }

    //toString method that formats the rank, suit, and point values of the card object
    public String toString(){
        return rank + " of " + suit + " (point value = " + pointValue + ")"; 
    }


}