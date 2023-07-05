package chainofresponsibility;

import org.junit.jupiter.api.Test;

class LeaveRequestHandlerTests {

    @Test
    void leave_request_handler_test() {
        LeaveRequestHandler supervisor = new SupervisorHandler(5);
        LeaveRequestHandler manager = new ManagerHandler(10);

        supervisor.setNextHandler(manager);

        LeaveRequest request1 = new LeaveRequest(3);
        supervisor.handleRequest(request1);

        LeaveRequest request2 = new LeaveRequest(7);
        supervisor.handleRequest(request2);

        LeaveRequest request3 = new LeaveRequest(12);
        supervisor.handleRequest(request3);
    }

}
