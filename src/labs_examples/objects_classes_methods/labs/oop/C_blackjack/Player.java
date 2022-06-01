package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player { //this will hold player info

    String name;
    Deck deck;
    Hand hand;
    int potValue = 100;

    public Player(String name, Deck deck, Hand hand, int potValue) {
        this.name = name;
        this.deck = deck;
        this.hand = hand;
        this.potValue = potValue;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player() {

    }

    public boolean noMoney(int amountOfMoney){
        return amountOfMoney < 1;
    }

    public int placeBet(int bet) {
        if (potValue >= bet) {
            System.out.println("You placed a bet for " + bet + "$");
            potValue -= bet;
            return bet;
        } else {
            System.out.println("You have no more money");
            return 0;
        }
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", deck=" + deck +
                ", hand=" + hand +
                ", potValue=" + potValue +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }
}