import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.io.FileWriter;

public class DuplicateCounter {
    private List<String> text;
    private String wordcounter = " ";





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






    public DuplicateCounter() {
        this.text = new LinkedList<String>();
    }







    public void count(String dataFile) {
        StoreText(dataFile);
        HashMap<String, Integer> wordSet = new HashMap<String, Integer>();
        for (String s1 : getText()) {  //new iteration method shown by proffessor Hollander
            if (wordSet.containsKey(s1)) { //map is set up of (string,value). The first value is the "Key": organized <key,value>. Checks to see if the hashmap already has key of that string
                wordSet.put(s1, wordSet.get(s1) + 1); //.put of an existing key replaces previous value with current value. .get retrieves the value at that key.
            } else {
                wordSet.put(s1, 1); // if the key doesn't exist, creating a new (string, value) with one occurrence so far.
            }
        }
        wordcounter = wordSet.toString(); //providing information to class variable wordCounter

    }






    public void write(String outputFile) throws IOException {
        FileWriter outputtingwords = new FileWriter(outputFile);
        outputtingwords.write(wordcounter);
        outputtingwords.close();
    }





}









