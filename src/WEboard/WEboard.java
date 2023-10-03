package WEboard;
import java.util.Scanner;
public class WEboard {
    public static void main(String[] args) {
        //Declare variables
        Scanner kb = new Scanner(System.in);
        Action[] actions = new Action[10];
        boolean running = true;
        //Initialize array of actions
        for(int i = 0; i < actions.length; i++)
            actions[i] = new Action();

        while(running) {
            String input = kb.next().toLowerCase();
            switch(input) {
                case "quit":
                    running = false;
                    break;
                case "0":
                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                default:
                    System.out.printf("Command %s unkown.\n", input);
            }
        }
    }
}