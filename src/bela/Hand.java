package bela;

public class Hand extends CardCollection {
    public boolean talonIsClosed = true;

    public void openTalon() {
        talonIsClosed = false;
    }

    @Override
    public String toString(Suit trumpSuit) {

        StringBuilder string = new StringBuilder("[ ");
        for(Card card : cards) {
            string.append(card.toString(trumpSuit)).append(" ");
        }

        if(talonIsClosed)  {
            string.append("** ** ");
        }

        string.append("]");
        return string.toString();
    }
}
