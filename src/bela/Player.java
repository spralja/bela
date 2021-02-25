package bela;

public abstract class Player {
    private Hand hand;

    public abstract Card play(Game game);

    public abstract Declaration declareDeclarations(Game game);

    public abstract Suit declareTrumpSuit(Game game);

    public abstract Player draw(Card card);
}
