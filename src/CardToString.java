import java.util.StringTokenizer;

/**
 * Created by danawacomputer on 2017-07-14.
 */
class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        c1 = c2;

        System.out.println(c1.toString());
    }
}

class Card {
    private String kind;
    private int number;

    Card() {
        this("SPADE", 1);
    }
    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    void setKind(String kind) {this.kind = kind;}
    String getKind() {return kind;}

    void setNumber(int number) {this.number = number;}
    int getNumber() {return number;}
}