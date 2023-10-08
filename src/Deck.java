import java.util.ArrayList;

public class Deck extends Hand {

    final int MAX_NUM_CARDS = 52;

    public Deck() {
        for (CardSuits cardSuit : CardSuits.values()) {
            for (CardValues cardValue : CardValues.values()) {
                deck.add(new Card(cardSuit, cardValue));
            }
        }
    }

    public void shuffle() {
        ArrayList<Card> newDeck = new ArrayList<Card>();

        while (this.deck.size() > 0) {
            int randIndex = (int) (Math.floor(Math.random() * this.deck.size()));

            Card randCard = deck.get(randIndex);

            this.deck.remove(randCard);
            newDeck.add(randCard);
        }

        this.deck = newDeck;
    }

    public void dealCardsEvenly(Hand[] decks) {
        int evenCards = (int) (Math.floor((this.deck.size() / decks.length)));

        for (int i = 0; i < decks.length; i++) {
            for (int j = 0; j < evenCards; j++) {
                this.dealCard(this.getFirstCard(), decks[i]);
            }
        }
    }

    public void returnAllCards(Hand[] decks) {
        for (int i = 0; i < decks.length; i++) {
            while (decks[i].deck.size() > 0) {
                this.returnCard(decks[i].getFirstCard(), decks[i]);
            }
        }
    }
}
