import java.util.Scanner;
public class Interface {
    Scanner scanner;
    Interface() {
        this.scanner = new Scanner(System.in);
    }
    public String next() {
        String input = this.scanner.nextLine();
        this.scanner.nextLine();

        switch (input) {
            case "f":
                break;
            case "s":
                break;
            case "q":
                break;
            case "c":
                break;
        }
    }
}
