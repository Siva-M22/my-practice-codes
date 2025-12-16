public class StepTracker {
    public static void main(String[] args) {
        int goalSteps = 10000;
        int stepsTaken = 7850;

        
        int stepsLeft = goalSteps - stepsTaken;

        
        boolean goalReached = stepsTaken>=goalSteps;

        System.out.println("Steps taken: " + stepsTaken);
        System.out.println("Steps left to reach goal: " + stepsLeft);
        System.out.println("Goal reached: " + goalReached);

        
        stepsTaken+=150;

        System.out.println("Steps after walking more: "+stepsTaken);

        
        boolean newGoalStatus = (stepsTaken>=goalSteps) && (stepsTaken<20000);

        System.out.println("New goal status: "+newGoalStatus);
    }
}
