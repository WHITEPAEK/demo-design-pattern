package chainofresponsibility;

// Concrete Handler
public class ManagerHandler implements LeaveRequestHandler {

    private int maxDays;
    private LeaveRequestHandler nextHandler;

    public ManagerHandler(int maxDays) {
        this.maxDays = maxDays;
    }

    @Override
    public void setNextHandler(LeaveRequestHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() <= this.maxDays) {
            System.out.println("Manager: 휴가 신청 승인됨.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
