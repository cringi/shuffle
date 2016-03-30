import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        int count = 0;
        Deck d = new Deck();
        ArrayList<Card> hand1 = new ArrayList<>();
        ArrayList<Card> hand2 = new ArrayList<>();

        while (count > 5) {
            hand1.add(d.getTopCard());
            hand2.add(d.getTopCard());

            count++;
        }
    }
}
