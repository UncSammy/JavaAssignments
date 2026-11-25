
package orientationtasks;

public class Customer {

    private static int nextId = 1;

    private int id;
    private double startTime;
    private double endTime;

    public Customer() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public double getTimeSpent() {
        return endTime - startTime;
    }
}
