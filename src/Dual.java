public class Dual {

    private String [][] primalLP;

    private Dual(String[][] primalLP){
        this.primalLP = primalLP;
    }

    public String switchMinMax(String input){
        String output ="";
        if(input.equals("max")){
            output = "min";
        } else if(input.equals("min")){
            output = "max";
        } else {
            throw new IllegalArgumentException("geben sie min oder max ein!");
        }
        return output;
    }

    public void fillFirstRowAnfColumn(String[][] input){
        //TODO
        for (int i = 1; i < input.length - 2; i++) {
            input[0][i] = "y" + i;
        }
        for (int i = 2; i < input[0].length; i++) {
            input[i][0] = "NB" + i;
        }
    }

    public void fillInValues(String[][] primal, String[][] dual){
        for (int i = 1; i < primal.length; i++) {
            dual[dual.length][i] = primal[1][i];
        }
    }

    //TODO: check, ob Variablen normal oder nicht

    //generiert aus einem primalen LP ein duales LP
    public String[][] generateDual(String[][]primalLP){
        //TODO: Eingabeprüfung
        String[][] dualLP = new String[primalLP.length][primalLP[0].length];
        //TODO: ausbessern: dual hat so viele NBs, wie primal Variablen hat
        dualLP[0][0] = switchMinMax(primalLP[0][0]);
        fillFirstRowAnfColumn(dualLP);

        return dualLP;
    }
}
