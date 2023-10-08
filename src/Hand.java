import java.util.ArrayList;

public class Hand {

    ArrayList<Card> deck = new ArrayList<Card>();

    public void showDeck() {
        for (Card card : this.deck) {
            int cardIndex = this.deck.indexOf(card);

            System.out.print(String.format("%s, ", card));

            if (cardIndex % 3 == 0 && cardIndex != 0)
                System.out.println("");
        }
        System.out.println("");
    }

    public void dealCard(Card card, Hand otherDeck) {
        if (this.deck.size() > 0) {
            Card dealtCard = card;

            this.deck.remove(dealtCard);
            otherDeck.deck.add(dealtCard);
        }
    }

    public void returnCard(Card card, Hand otherDeck) {
        if (this.deck.size() < 52) {
            Card removedCard = card;

            this.deck.add(removedCard);
            otherDeck.deck.remove(removedCard);
        }
    }

    public Card getFirstCard() {
        return this.deck.get(0);
    }

    public Card getLastCard() {
        return this.deck.get(this.deck.size() - 1);
    }

    public Card getCard(int index) {
        return this.deck.get(index);
    }
}
