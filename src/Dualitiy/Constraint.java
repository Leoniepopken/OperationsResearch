package Dualitiy;

public class Constraint {

    private Normality normality;
    private int number;
    private int [] values;
    private EqualitySign equalitySign;

    public Constraint(Normality normality, int number, EqualitySign equalitySign, int[] values) {
        this.normality = normality;
        this.number = number;
        this.values = values;
        this.equalitySign = equalitySign;
    }

    public Normality getNormality() {
        return normality;
    }

    public int getNumber() {
        return number;
    }

    public int[] getValues() {
        return values;
    }

    public EqualitySign getEqualitySign() {
        return equalitySign;
    }
}
