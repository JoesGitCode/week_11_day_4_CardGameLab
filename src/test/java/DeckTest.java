import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card cardHeart;
    Card cardSpade;


    @Before
    public void before(){
        deck = new Deck();
        cardHeart = new Card(SuitType.HEARTS, RankType.EIGHT);
        cardSpade = new Card(SuitType.SPADES, RankType.QUEEN);
    }

    @Test
    public void theDeckStartsEmpty(){
        assertEquals(0, deck.numberOfCardsInDeck());
    }

    @Test
    public void canAddCArdToDeck(){
        deck.addCard(cardHeart);
        assertEquals(1, deck.numberOfCardsInDeck());
    }

    @Test
    public void deckCanBePopulatedWithAllCards(){
        deck.populate();
        assertEquals(52, deck.numberOfCardsInDeck());
    }

}
