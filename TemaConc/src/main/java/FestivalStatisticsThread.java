import java.util.HashMap;
import java.util.Map;

public class FestivalStatisticsThread implements Runnable {
    private FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
        while (!(gate.getList().size() == 100)) {
            if (!gate.getList().isEmpty()) {
                printStats();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        printStats();
    }

    private void printStats() {
        System.out.println(gate.getList().size() + " people have entered: ");
        Map<TicketType, Integer> mapFestivalAttendees = new HashMap<>();
        for (TicketType ticket : gate.getList()) {
            Integer count = mapFestivalAttendees.get(ticket);
            if (count == null) {
                mapFestivalAttendees.put(ticket, 1);
            } else {
                mapFestivalAttendees.put(ticket, ++count);
            }
        }
        for (Map.Entry<TicketType, Integer> entry : mapFestivalAttendees.entrySet()) {
            System.out.println(entry.getValue() + " have " + entry.getKey() + " tickets");
        }
    }
}
