import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {
    protected final List<Card> cards = new ArrayList<>();
    public int score(){
        int score = 0;
        for(Card card:cards){
            score += card.getFaceValuevalue();
        }
        return score;
    }

    public void addCards(List<Card> c){
       for(Card card: c){
           cards.add(card);
       }
    }

    public int size(){
        return cards.size();
    }
}
