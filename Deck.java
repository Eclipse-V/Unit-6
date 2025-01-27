class Deck{
    //instance variables
    private Card[] cards;
    private int size;

    //constructor class 
    public Deck(String[] ranks, String[] suits, int[] pointValues){
        Card[] cardsArray = new Card[ranks.length * suits.length];
        int k = 0;
        //creates the card objects and adds them to the array
        for (int i = 0; i < suits.length; i++){
            for (int j = 0; j < ranks.length; j++){
                cardsArray[k] = new Card(ranks[j], suits[i], pointValues[j]);
                k++;
            }
        }
        cards = cardsArray;
        size = cards.length;

        //shuffles the deck
        shuffle();
        

    }
    //boolean method to check if the deck is at zero or not
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
            return false;

    }
    //checks how many cards are left
    public int size(){
        return size;
    }
    //checks to see if there are any cards left
    //if there are cards left, the deck is decreased by one and it returns the amount left
    public Card deal(){
        if (cards.length > 0){
            size--;
            return cards[size];
        }
        return null;
    }

    //toString method to format the remaining deck of cards
    public String toString(){
        String undealtCards = "";
        String dealtCards = "";
        for(int i = 0; i < size; i++){
            undealtCards += cards[i] + "\n";
        }
        for(int j = size; j < cards.length; j++){
            dealtCards += cards[j] + "\n";
        }

        return "size = " + size + "\nUndealth cards: \n" + undealtCards + "\n" + "Dealth cards: \n" + dealtCards;

    }

    //shuffles the cards around
    public void shuffle(){
        this.size = this.cards.length;
        int k = size - 1;
        int r = (int)(Math.random() * k) + 1; 
        Card temp = cards[k];
        cards[k] = cards[r];
        cards[r] = temp;
    }


}
