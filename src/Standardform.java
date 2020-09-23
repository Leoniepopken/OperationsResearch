import java.util.Arrays;
import java.util.Scanner;

public class Standardform {

    String [] equationsInput;

    public Standardform(){

    }

    private String scanText(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    private int scanInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    private void generateArray(){
        equationsInput = new String[scanInt("Wie viele Gleichungen werden benötigt?")];
    }

    private void fillInputArray(){
        for (int i = 0; i < equationsInput.length; i++) {
            int j = i + 1;
            equationsInput[i] = scanText("Bitte " + j + "te Gleichung eingeben");
        }
        System.out.println(Arrays.toString(equationsInput));
    }

    private String switchPlusMinus(String message){
        String result = "";
        char[] letters = new char[message.length()];
        for (int i = 0; i < message.length(); i++) {
            letters[i] = message.charAt(i);
        }
        for (int i = 0; i < letters.length; i++) {
            if(letters[i] == '-'){
                letters[i] = '+';
            }
            if (letters[i] == '+'){
                letters[i] = '-';
            }
        }
        for (int i = 0; i < letters.length; i++) {
            result += letters[i];
        }
        return result;
    }

    private void switchToEquals(String input){

    }

    private void addVariable(String input){
        if(input.contains(">=")){
            input += " -s";
        }
        if(input.contains("<=")){
            input += " +s";
        }
    }

    private void generateStandardForm(){
        if(equationsInput[0].startsWith("max")){
            for (int i = 1; i < equationsInput.length; i++) {
                addVariable(equationsInput[i]);
            }
        } else if (equationsInput[0].startsWith("min")){
            String firstRow = equationsInput[0];
            equationsInput[0] = switchPlusMinus(firstRow);
            for (int i = 1; i < equationsInput.length; i++) {
                addVariable(equationsInput[i]);
            }
        }
    }
}
