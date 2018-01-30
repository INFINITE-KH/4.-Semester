package tester;

import java.util.Scanner;
import rpncalculator.StackPath;

public class psvm {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isAction;
        StackPath sp = new StackPath();
        
        while(true){
            String consoleInput = in.nextLine();
            if(consoleInput.equals("quit")){
                break;
            }
            String[] rawArguments = consoleInput.split(" ");
            for (int i = 0; i < rawArguments.length; i++) {
                String rawArgument = rawArguments[i];
                isAction = false;
                switch(rawArgument){
                    case "/":sp.push(sp.pop()/sp.pop()); isAction = true; break;
                    case "*":sp.push(sp.pop()*sp.pop()); isAction = true; break;
                    case "+":sp.push(sp.pop()+sp.pop()); isAction = true; break;
                    case "-":sp.push(sp.pop()-sp.pop()); isAction = true; break;
                }
                if(!isAction){
                    Double d = Double.parseDouble(rawArgument);
                    sp.push(d);
                }
            }
            Double[] givenNumbers = sp.peekAll();
            for (int i = 0; i < givenNumbers.length; i++) {
                System.out.println(givenNumbers[i]);
            }
        }
    }
    
}
