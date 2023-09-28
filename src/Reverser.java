public class Reverser extends Transpose {

    public Reverser(String s) {
        super(s);
    }

    public String reverseText(String word) {
        return super.encode(word);
    }

    public String decode(String word) {
        return super.decode(word);
    }
}
