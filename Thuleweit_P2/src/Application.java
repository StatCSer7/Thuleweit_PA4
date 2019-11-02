public class Application {
    public static void main (String[] args) {
        DuplicateCounter duplicateCounter = new DuplicateCounter();

        try {
            duplicateCounter.count("problem2.txt");
        } catch (Exception excpt) {
            System.out.println("Failure in count.");
            System.exit(1);
        }

        try {
            duplicateCounter.write("unique_word_counts.txt");
        } catch (Exception excpt) {
            System.out.println("Failure in write.");
            System.exit(1);
        }
    }
}