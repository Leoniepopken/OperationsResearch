package Dualitiy;

import java.util.List;

public class Dual {

    public MinMax generateDualEnum(LinearProgram input){
        if(input.getStatus().equals(MinMax.max)){
            return MinMax.min;
        } else{
            return MinMax.max;
        }
    }

    public GoalFuction generateGoalFuction(LinearProgram input){
        MinMax status = generateDualEnum(input);
        int [] values = new int[input.getConstraints().size()];
        for (int i = 0; i < input.getConstraints().size(); i++) {
            values[i] = input.getConstraints().get(i).getValues()[input.getConstraints().get(i).getValues().length];
        }
        return new GoalFuction(status, values);
    }

    public List<Constraint> generateConstraints(LinearProgram input){
        return null;
    }

    public LinearProgram generateDual(LinearProgram input){
        MinMax dualEnum = generateDualEnum(input);
        GoalFuction dualGoalFunction = generateGoalFuction(input);
        return null;
    }
}
