package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player { //this will hold player info

    String name;
    Hand hand;
    int potValue; //the amount of money they have)

    public Player(String name, Hand hand, int potValue) {
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;
    }

    public boolean computerAi(){
        if(hand.getHandValue() < 16){
            return true;
        } else {
            return false;
        }
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
