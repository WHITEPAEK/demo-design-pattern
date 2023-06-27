package strategy.scheduler;

import org.junit.jupiter.api.Test;

class SchedulerTests {

    @Test
    void scheduler_strategy_test() {

        String type = "P";
        Scheduler scheduler = switch (type) {
            case "R" -> new RoundRobin(); // 한명씩 차례로 할당
            case "L" -> new LeastJob(); // 쉬고 있거나 대기가 가장 적은 상담원에게 할당
            case "P" -> new PriorityAllocation(); // 우선순위가 높은 고객 먼저 할당
            case "A" -> new AgentGetCall(); // 상담원이 상담 가져가기
            default -> null;
        };
        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }

}
