/**
 * Created by michaelplott on 9/12/16.
 */
public class Computer {
    // class represents various computer parts, if it has a solid state drive, the cost and if it was worth it.
    String processor;
    String gpu;
    boolean haveSolidState;
    int cost;
    boolean wasWorthIt;

    Computer(String newProcessor, String newGpu, Boolean newHaveSolidState, int newCost, boolean newWasWorthIt) {
        setProcessor(newProcessor);
        setGpu(newGpu);
        setHaveSolidState(newHaveSolidState);
        setCost(newCost);
        setWasWorthIt(newWasWorthIt);
    }

    String getProcessor() {
        return processor;
    }

    void setProcessor(String newProcessor) {
        processor = newProcessor;
    }

    String getGpu() {
        return gpu;
    }

    void setGpu(String newGpu) {
        gpu = newGpu;
    }

    boolean getHaveSolidState() {
        return haveSolidState;
    }

    void setHaveSolidState(boolean newHaveSolidState) {
        haveSolidState = newHaveSolidState;
    }

    int getCost() {
        return cost;
    }

    void setCost(int newCost) {
        cost = newCost;
    }

    boolean getWasWorthIt() {
        return wasWorthIt;
    }

    void setWasWorthIt(boolean newWasWorthIt) {
        wasWorthIt = newWasWorthIt;
    }

}
