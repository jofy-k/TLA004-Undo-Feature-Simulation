package com.mycompany.dsa;

import java.util.*;

public class Liboon_TLA004 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stacks = new Stack<>();

        while (true) {
            System.out.println("Enter an action, type 'undo' to undo, type 'exit' to exit:");
            String action = input.nextLine();

            if (action.equalsIgnoreCase("undo")) {
                if (!stacks.isEmpty()) {
                    String undone = stacks.pop();
                    System.out.println("You undid: " + undone);
                } else {
                    System.out.println("Nothing to undo.");
                }
            } else if (action.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else {
                stacks.push(action);
                System.out.println("Pushed: '" + action);
            }
        }
    }
}
