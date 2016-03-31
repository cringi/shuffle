import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        int hand1total=0, hand2total=0;
        String hand1print="", hand2print="";
        Deck d = new Deck();
        ArrayList<Card> hand1 = new ArrayList<>();
        ArrayList<Card> hand2 = new ArrayList<>();

        for (int x=0;x<5;x++) {
            hand1.add(d.getTopCard());
            hand2.add(d.getTopCard());
        }

        for (Card c: hand1) {
            hand1total += c.pointValue();
            hand1print = hand1print + c.toString() + "\n";
        }

        for (Card c: hand2) {
            hand2total += c.pointValue();
            hand2print = hand2print + c.toString() + "\n";
        }

        System.out.printf("Hand 1: %d total points%n", hand1total);
        System.out.println(hand1print);

        System.out.printf("Hand 2: %d total points%n", hand2total);
        System.out.println(hand2print);

        if (hand1total > hand2total) {
            System.out.println("Hand 1 wins");
        }
        else if (hand1total == hand2total) {
            System.out.println("Tie");
        }
        else {
            System.out.println("Hand 2 wins");
        }
    }
}
