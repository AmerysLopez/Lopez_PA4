import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.io.FileWriter;

public class DuplicateRemover {
    private List<String> text;
    private String uniqueWords = " ";


    public List<String> getText() {
        return text;
    }


    public void StoreText(String dataFile) {
        try {
            FileReader inFile = new FileReader(dataFile);
            Scanner in = new Scanner(inFile);
            while (in.hasNext()) {
                text.add(in.next());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public DuplicateRemover() {
        this.text = new LinkedList<String>();
    }


    public void remove(String dataFile) {
        StoreText(dataFile);
        Set<String> wordSet = new HashSet<String>();
        for (String s : getText()) {
            wordSet.add(s);
        }

        for (String s : wordSet) {
            uniqueWords = uniqueWords.concat(s);
            uniqueWords = uniqueWords.concat(" ");
        }
    }


    public void write(String outputFile) throws IOException {
        FileWriter outputtingwords = new FileWriter(outputFile);
        outputtingwords.write(uniqueWords);
        outputtingwords.close();

    }


}








