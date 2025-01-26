class Deck{
    private Card[] cards;
    private int size;

    public Deck(String[] ranks, String[] suits, int[] pointValues){
        cards = ranks.length * suits.lengths;
        

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
