import java.util.Scanner;

public class WordDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        scanner.useDelimiter(",");
        
        String inputLine = scanner.nextLine();
        
        String[] words = inputLine.split(",");
    
        for (String word : words) {
            System.out.println(word);
        }
    }
}
