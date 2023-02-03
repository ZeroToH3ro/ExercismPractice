public class Blackjack {

    public int parseCard(String card) {
        //* Declare variable store card's score */
        int score = 0;
        switch (card) {
            case "jack":
            case "queen":
            case "king":
            case "ten":
                score = 10;    
                break;
            case "ace":
                score = 11;
                break;
            case "one":
                score = 1;
                break;
            case "two":
                score = 2;
                break;
            case "three":
                score = 3;
                break;
            case "four":
                score = 4;
                break;
            case "five":
                score = 5;
                break;
            case "six":
                score = 6;
                break;
            case "seven":
                score = 7;
                break;
            case "eight":
                score = 8;
                break;
            case "nine":
                score = 9;
                break;
        }
        return score;
    }

    public boolean isBlackjack(String card1, String card2) {
        boolean checkBlackJack = false;
        switch (card1) {
            case "ace": 
            {
                if (card2 == "10" || card2 == "queen" || card2 == "king" || card2 == "jack"){
                    checkBlackJack = true;
                }
            }
            break;
            case "queen":
            case "jack":
            case "king":
            case "ten":
                if (card2 == "ace"){
                    checkBlackJack = true;
                }
            break;    
        }
        return checkBlackJack;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        String result = "";
        switch (dealerScore) {
            case 10:
            case 11:
                if (isBlackjack) {
                    result = "S";
                }
            break;
            default:
                if (isBlackjack) {
                    result = "W";
                }
            break;
        }
        return result;
    }

    public String smallHand(int handScore, int dealerScore) {
        String result = "";
        if (handScore >= 17) {
            result = "S";
        } else if (handScore <= 11) {
            result = "H";
        } else if (handScore >= 12 && handScore <= 16) {  
            if (dealerScore >= 7) {
                result = "H";
            } else {
                result = "S";    
            }
        }
        return result;
    }  
    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        String result = "";
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        
        if (parseCard(card1) == 11 && parseCard(card2) == 11) {
            result = "P";
            return result;
        }        

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
