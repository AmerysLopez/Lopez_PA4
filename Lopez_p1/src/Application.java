import java.io.IOException;

public class Application {
    public static void main (String[]args) throws IOException {
        DuplicateRemover p = new DuplicateRemover();
        p.remove("problem1.txt");
        p.write("unique_words.txt");
    }
}
