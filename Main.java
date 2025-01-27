public class Main{
    public static void main(String[] args){
        //CardGameGUI gui = new CardGameGUI(new ElevensBoard());
        //gui.displayGame();
        String[ ] ranks = {"A", "K", "Q"};
        String[ ] suits = {"diamond", "heart"};
        int[ ] pointValues = {1, 2, 3};
        Deck d1 = new Deck(ranks, suits, pointValues);
        d1.deal();
        d1.deal();

        System.out.println(d1);




    }
}
