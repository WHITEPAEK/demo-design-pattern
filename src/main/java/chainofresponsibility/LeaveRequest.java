package chainofresponsibility;

// Request
public class LeaveRequest {

    private int days;

    public LeaveRequest(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}