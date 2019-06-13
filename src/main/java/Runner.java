public class Runner {
    public static void main(String[] args){
        Card card = new Card(SuitType.SPADES, RankType.QUEEN);
        System.out.println(card.getAllTheSuitTypes());
    }
}