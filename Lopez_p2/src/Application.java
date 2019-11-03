import java.io.IOException;

public class Application {

    public static void main (String[]args) throws IOException {
        DuplicateCounter p = new DuplicateCounter();
        p.count("problem2.txt");
        p.write("unique_words_counts.txt");
    }
}
