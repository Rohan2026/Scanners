import java.util.Scanner;

public class Scanner2
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
           if (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println(str);
        }
     }
  }
    public static void main(String[] args) {
        Scanner2 Scanner2 = new Scanner2();
        Scanner2.run();
    }
}