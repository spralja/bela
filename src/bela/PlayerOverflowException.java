package bela;

public class PlayerOverflowException extends RuntimeException {
    public PlayerOverflowException(String messege) {
        super(messege);
    }
}