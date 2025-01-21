public class Card{
    private rank;
    private suit;
    private pointValue;

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
        if(this.rank.equals(c.rank) && this.suit.equals(c.suit) && this.pointValuen== c.pointValue){
            return true;
        }
    }

    public String toString(){
        return rank + " of " + suit + " ( point value = " + pointValue + ")"; 
    }


}
