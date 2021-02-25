package bela;

public class Declaration {
    private DeclarationType type;
    private Card topCard;

    public Declaration(DeclarationType type, Card topCard) {
        this.type = type;
        this.topCard = topCard;
    }

    public int getValue() {
        return switch(type) {
            case TIERCE -> 20;
            case QUARTE -> 50;
            case QUINTE -> 100;
            case CARREE -> switch(topCard.getRank()) {
                case IX -> 150;
                case J -> 200;
                default -> 100;
            };
        };
    }

    public int compare(Declaration that, Suit trumpSuit) {
        if(this.type.getPower() == that.type.getPower()) {
            switch(this.type) {
                case CARREE:
                    if(this.topCard.getRank().getCarreeDeclarationPower() > that.topCard.getRank().getCarreeDeclarationPower()) {
                        return 1;
                    } else {
                        return -1;
                    }
                default:
                    if(this.topCard.getSuit() == trumpSuit || that.topCard.getSuit() == trumpSuit) {
                        if(this.topCard.getSuit() != that.topCard.getSuit()) {
                            if(this.topCard.getSuit() == trumpSuit) {
                                return 1;
                            } else {
                                return -1;
                            }
                        } else {
                            if(this.topCard.getRank().getStraightDeclarationPower() >
                                    that.topCard.getRank().getStraightDeclarationPower()) {
                                return 1;
                            } else {
                                return -1;
                            }
                        }
                    } else {
                        if(this.topCard.getRank() == that.topCard.getRank()) {
                            return 0;
                        } else {
                            if(this.topCard.getRank().getStraightDeclarationPower() >
                                    that.topCard.getRank().getStraightDeclarationPower()) {
                                return 1;
                            } else {
                                return -1;
                            }
                        }
                    }
            }
        } else {
            if(this.type.getPower() > that.type.getPower()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
