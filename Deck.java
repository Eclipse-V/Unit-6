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

        //shuffle();
        

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

    }

}
