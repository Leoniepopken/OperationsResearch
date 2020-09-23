import java.io.*;
import java.util.Scanner;

public class SimplexAlgorithmus {

    private int columns;
    private int rows;
    private String [][] matrix;
    private double variable;

    public SimplexAlgorithmus(int variablen, int basisvariablen){
        this.columns = variablen + 2;
        this.rows = basisvariablen + 2;
        this.matrix = new String[rows][columns];
    }

    private double scanText(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextDouble();
    }

    private void fillVariablen(){
        int j = 0;
        for (int i = 1; i < columns - 1; i++) {
            matrix[0][i] = "x" + i;
            j = i;
        }
        matrix[0][j + 1] = "Result";
    }

    private void fillZielfunktion(){
        matrix[1][0] = "z";
        for (int i = 1; i < columns; i++) {
            matrix[1][i] = String.valueOf(scanText("bitte den Wert der Variablen eingeben"));
        }
    }
}
