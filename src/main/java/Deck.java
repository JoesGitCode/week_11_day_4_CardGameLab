import java.util.ArrayList;


public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int numberOfCardsInDeck(){
        return this.cards.size();
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public SuitType[] getAllTheSuitTypes(){
        SuitType[] suits = SuitType.values();
        return suits;
    }

    public RankType[] getAllTheRankTypes(){
        RankType[] ranks = RankType.values();
        System.out.println(ranks);
        return ranks;
    }

    public makeDeckOfCards() {
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();

        for (i < 5, i ++)

    }

}

