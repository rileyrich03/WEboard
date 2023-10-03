import java.util.Scanner;

public class WEboard {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);        
        boolean running = true;
        while(running) {
            String input = kb.next().toLowerCase();
            switch(input) {
                case "quit":
                    running = false;
                    break;
                default:
                    System.out.printf("Command %s unkown.\n", input);
            }
        }
    }
}