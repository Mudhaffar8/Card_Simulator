public class Card {
    CardSuits suit;
    CardValues value;

    public Card(CardSuits suit, CardValues value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return this.suit.toString();
    }

    public int getValue() {
        return this.value.value;
    }

    public int compare(Card card2) {
        if (this.value.value > card2.value.value) {
            return 1;
        } else if (this.value.value == card2.value.value) {
            return 0;
        } else {
            return -1;
        }
    }

    public int getCardDiff(Card card2) {
        return this.value.value - card2.value.value;
    }

    public String toString() {
        return String.format("%s of %s", this.value, this.suit);
    }
}