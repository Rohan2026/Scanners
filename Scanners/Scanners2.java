import java.util.Scanner;

public class MyScanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in).useDelimiter(",");
        while (true) {
            int str = scanner.nextInt();
            System.out.println(str * 3);
        }
    }

    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}