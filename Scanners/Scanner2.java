import java.util.Scanner;

public class Scanner2
{

    public void run() {
        Scanner scanner = new Scanner(System.in).useDelimiter(",");
        while (true) {
            String str = scanner.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner2 myScanner = new Scanner2();
        myScanner.run();
    }
}