/*Assignment 2
Alexander Papiro
CIS211-400
02-06-2023*/
//I wrote all the code submitted, and I have provided citations and references where appropriate.
import java.util.Scanner;

public class Main {
    static Stack<Integer> stack = new ArrayStack<>();

    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner scannerOne = new Scanner(System.in);
        Scanner scannerTwo = new Scanner(System.in);
        int selection = 0;
        int selection2 = 0;
        boolean isValid = false;
        do {
            System.out.println("#############################################################################");
            System.out.println("1: View all contents. \n" + "2: Pop \n" + "3: Peek \n" + "4: Push \n" + "5: Exit Program");
            selection = scannerOne.nextInt();
            switch (selection) {
                case 1:
                    if (stack.isEmpty() == false) {
                        stack.toString();
                    }
                    else {
                        System.out.println("The stack is empty");
                    }
                    break;
                case 2:
                    if (stack.isEmpty() == false) {
                        stack.pop();
                    }
                    else {
                        System.out.println("The stack is empty");
                    }
                    break;
                case 3:
                    if (stack.isEmpty() == false) {
                        stack.peek();
                    }
                    else {
                        System.out.println("The stack is empty");
                    }
                    break;
                case 4:
                    System.out.println("Which integer do you want to add to this stack?");
                    selection2 = scannerTwo.nextInt();
                    stack.push(selection2);
                    break;
                case 5:
                    System.exit(0);
            }
        }while(isValid != true);
    }
}

