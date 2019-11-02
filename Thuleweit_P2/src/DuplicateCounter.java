import java.util.HashMap;
import java.io.*;
import java.util.Scanner;

public class DuplicateCounter {
    HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();

    public void count(String datafile) throws IOException {
        FileInputStream stringStream = null;
        Scanner sS = null;
        String words;

        stringStream = new FileInputStream(datafile);
        sS = new Scanner(stringStream);

        while (sS.hasNext()) {
            words = sS.next();
            if (wordCounter.get(words) == null) {
                wordCounter.put(words, 1);
            }
            else {
                int value = wordCounter.get(words);
                wordCounter.put(words, value + 1);
            }
        }

        sS.close();
        stringStream.close();
    }

    public void write(String outputFile) throws IOException {
        FileOutputStream outStream = null;
        PrintWriter oS = null;

        outStream = new FileOutputStream(outputFile);
        oS = new PrintWriter(outStream);

        for (String words : wordCounter.keySet()) {
            int value = wordCounter.get(words);
            oS.println(words + " - " + value + " times(s)");
        }

        oS.close();
        outStream.close();
    }
}