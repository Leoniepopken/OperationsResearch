package Dualitiy;

public class GoalFuction {

    private MinMax status;
    private int [] values;

    public GoalFuction(MinMax status, int[] values) {
        this.status = status;
        this.values = values;
    }


    public MinMax getStatus() {
        return status;
    }

    public int[] getValues() {
        return values;
    }
}
