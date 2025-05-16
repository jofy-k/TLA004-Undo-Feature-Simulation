package com.mycompany.liboon;

import java.util.*;

public class Liboon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stacks = new Stack<>();
//        System.out.println("Enter words to save to stacks: ");
//        String word1 = input.nextLine();
//        String word2 = input.nextLine();
//        
//        if(!word1.isEmpty() & (!word2.isEmpty())){
//            stacks.push(word1);
//            stacks.push(word2);
//        }else{
//            System.out.println("Please enter a two words.");
//        }

        while (true) {
            
            System.out.println("Enter an action type 'undo' to undo, type 'exit' to exit: ");
            String action = input.nextLine();
            stacks.push(action);
            
            if (action.equalsIgnoreCase("Exit")) {
                System.exit(0);
            }

            if (action.equalsIgnoreCase("Undo")) {
                System.out.println("You undid "+ stacks.peek() + ".");
            }
        }
    }
}
