public class Card {
    private String notation;
    private String value;
    private String suit;

    public Card(String notation) {
        this.notation = notation.toUpperCase();

        // Check for invalid input
        if (notation.length() < 2) {
            value = "Unknown";
            suit = "Unknown";
            return;
        }

        // Split value and suit
        String valuePart = notation.substring(0, notation.length() - 1);
        String suitPart = notation.substring(notation.length() - 1);

        // Determine the card value
        switch (valuePart) {
            case "A":
                value = "Ace";
                break;
            case "J":
                value = "Jack";
                break;
            case "Q":
                value = "Queen";
                break;
            case "K":
                value = "King";
                break;
            case "2": case "3": case "4": case "5": case "6":
            case "7": case "8": case "9": case "10":
                value = valuePart;
                break;
            default:
                value = "Unknown";
        }

        // Determine the suit
        switch (suitPart) {
            case "D":
                suit = "Diamonds";
                break;
            case "H":
                suit = "Hearts";
                break;
            case "S":
                suit = "Spades";
                break;
            case "C":
                suit = "Clubs";
                break;
            default:
                suit = "Unknown";
        }
    }

    public String getDescription() {
        if (value.equals("Unknown"))
            return "Unknown card value!";
        if (suit.equals("Unknown"))
            return "Unknown suit!";
        return value + " of " + suit;
    }
}
