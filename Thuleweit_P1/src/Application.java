public class Application {
    public static void main(String[] args) {
        DuplicateRemover duplicateRemover = new DuplicateRemover();

        try {
            duplicateRemover.remove("problem1.txt");
        } catch (Exception excpt) {
            System.out.println("Failure in remove.");
            System.exit(1);
        }

        try {
            duplicateRemover.write("unique_words.txt");
        } catch (Exception excpt) {
            System.out.println("Failure in write.");
            System.exit(1);
        }
    }
}