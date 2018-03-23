public class Card{
    private final int faceValue;
    private Suit suit;

    public  Card(int c, Suit s){
        faceValue = c;
        suit = s;
    }

    public int getFaceValuevalue(){
        return faceValue;
    }

    public Suit suit(){
        return suit;
    }
}
