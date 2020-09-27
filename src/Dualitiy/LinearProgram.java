package Dualitiy;

import java.util.LinkedList;

public class LinearProgram {

    private GoalFuction goalFunction;
    private LinkedList<Constraint> constraints;
    private LinkedList<Constraint> NNBs;
    private MinMax status;

    public LinearProgram(GoalFuction goalFunction, LinkedList<Constraint> constraints, LinkedList<Constraint> NNBs, MinMax status){
        this.goalFunction = goalFunction;
        this.constraints = constraints;
        this.NNBs = NNBs;
        this.status = status;
    }

    public GoalFuction getGoalFunction() {
        return goalFunction;
    }

    public LinkedList<Constraint> getConstraints() {
        return constraints;
    }

    public MinMax getStatus() {
        return status;
    }
}
