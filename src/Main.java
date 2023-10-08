public class Main {

    public static void main(String[] args) throws Exception {
        Deck deck1 = new Deck();

        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        Hand hand3 = new Hand();
        Hand hand4 = new Hand();

        deck1.shuffle();

        Hand[] hands = { hand1, hand2, hand3, hand4 };

        deck1.dealCardsEvenly(hands);

        for (Hand hand : hands) {
            hand.showDeck();
        }

        hand1.dealCard(hand1.getFirstCard(), hand2);

        hand2.showDeck();

        deck1.returnAllCards(hands);

        deck1.showDeck();
    }
}
