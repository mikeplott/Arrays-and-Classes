/**
 * Created by michaelplott on 9/12/16.
 */
public class VideoGameSpeedRunTimes {
    /* represents a way for video game speed runners to keep track of the games they are speed running,
     setting a goal and trying to obtain it */
    String game;
    double goal;
    double[] times = new double[5];
    boolean metGoal;

    VideoGameSpeedRunTimes(String newGame, Double newGoal, double[] newTimes, boolean newMetGoal) {
        setGame(newGame);
        setGoal(newGoal);
        setTimes(newTimes);
        setMetGoal(newMetGoal);
    }

        String getGame() {
            return game;
        }

        void setGame(String newGame) {
            game = newGame;
        }

        double getGoal() {
            return goal;
        }

        void setGoal(double newGoal) {
            if(goal > 1){
            goal = newGoal;
        }
            else{
                System.out.println("Impossible!");
            }
        }

        double[] getTimes() {
            return times;
        }

        void setTimes(double[] newTimes) {
            times = newTimes;
        }

        boolean getMetGoal() {
            return metGoal;
        }

        void setMetGoal(boolean newMetGoal) {
            metGoal = newMetGoal;
        }

    }


