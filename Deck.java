class Deck{
    private Card[] cards;
    private int size;

    public Deck(String[] ranks, String[] suits, int[] pointValues){
        Card[] cardsArray = new Card[ranks.length * suits.length];
        int k = 0;
        for (int i = 0; i < suits.length; i++){
            for (int j = 0; j < ranks.length; j++){
                cardsArray[k] = new Card(ranks[j], suits[i], pointValues[j]);
                k++;
            }
        }

        cards = cardsArray;
        size = cards.length;

        shuffle();
        

    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return size;
    }

    public Card deal(){
        if (cards.length > 0){
            size--;
            return cards[size];
        }
        return null;
    }

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

    public void shuffle(){
        this.size = this.cards.length;
        int k = size - 1;
        int r = (int)(Math.random() * k) + 1; 
        Card temp = cards[k];
        cards[k] = cards[r];
        cards[r] = temp;
    }


}
