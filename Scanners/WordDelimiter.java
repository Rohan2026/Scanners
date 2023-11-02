import java.util.Scanner;

public class WordDelimiter
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
           if (scanner.hasNext()) {
            scanner = scanner.useDelimiter(",|\n"); 
            String str = scanner.next();
            System.out.println(str);
           }
        }
    }
    public static void main(String[] args) {
        WordDelimiter WordDelimiter = new WordDelimiter();
        WordDelimiter.run();
    }
}