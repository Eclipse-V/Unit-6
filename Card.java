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

    public boolean equals(Card c){
        if(this.rank.equals(c.rank) && this.suit.equals(c.suit) && this.pointValue == c.pointValue){
            return true;
        }
    }

    public String toString(){
        return rank + " of " + suit + " ( point value = " + pointValue + ")"; 
    }


}
