package chainofresponsibility;

// Concrete Handler
public class SupervisorHandler implements LeaveRequestHandler {

    private int maxDays;
    private LeaveRequestHandler nextHandler;

    public SupervisorHandler(int maxDays) {
        this.maxDays = maxDays;
    }

    @Override
    public void setNextHandler(LeaveRequestHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getDays() <= this.maxDays) {
            System.out.println("Supervisor: 휴가 신청 승인됨.");
        } else if (this.nextHandler != null) {
            this.nextHandler.handleRequest(request);
        }
    }
}
