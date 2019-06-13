import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {


    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.SPADES, RankType.KING);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.SPADES, card.getSuit());
    }

    @Test
    public void canGetValue(){
        assertEquals(10, card.getValueFromEnum());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.KING, card.getRank());
    }

    @Test
    public void checkAllSuits(){
        assertEquals(4, card.getAllTheSuitTypes().length);
    }

    @Test
    public void checkAllRanks(){
        assertEquals(13, card.getAllTheRankTypes().length);
    }

    @Test
    public void countAllCards(){
        assertEquals(52, card.);
    }


}
