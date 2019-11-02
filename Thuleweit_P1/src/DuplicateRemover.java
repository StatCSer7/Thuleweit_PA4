import java.util.HashSet;
import java.io.*;
import java.util.Scanner;

public class DuplicateRemover {
    HashSet<String> uniqueWords = new HashSet<String>();

    public void remove(String datafile) throws IOException {
        FileInputStream stringStream = null;
        Scanner sS = null;
        String words;

        stringStream = new FileInputStream(datafile);
        sS = new Scanner(stringStream);

        while (sS.hasNext()) {
            words = sS.next();
            uniqueWords.add(words);
        }

        sS.close();
        stringStream.close();
    }

    public void write(String outputFile) throws IOException {
        FileOutputStream outStream = null;
        PrintWriter oS = null;

        outStream = new FileOutputStream(outputFile);
        oS = new PrintWriter(outStream);

        for (String words : uniqueWords) {
            oS.println(words);
        }

        oS.close();
        outStream.close();
    }
}