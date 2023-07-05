package chainofresponsibility;

// Handler
public interface LeaveRequestHandler {

    void setNextHandler(LeaveRequestHandler handler);
    void handleRequest(LeaveRequest request);

}
