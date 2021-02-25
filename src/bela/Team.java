package bela;

public enum Team {
    US,
    YOU,
    ;

    public static final int NUMBER_OF_TEAMS = 2;
    private int points = 0;

    public int getPoints() {
        return points;
    }

    public void addPoints(int pointsToAdd) {
        points += pointsToAdd;
    }

    public static void resetPoints() {
        US.points = 0;
        YOU.points = 0;
    }
}