package bela;

public class NotEnoughPlayersException extends RuntimeException{
    public NotEnoughPlayersException(String message) {
        super(message);
    }
}
