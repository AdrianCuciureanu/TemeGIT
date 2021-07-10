public class Main {
    public static void main(String[] args) {
        FestivalGate gate = new FestivalGate();
        startStatistics(gate);
        startFestival(gate);
    }

    private static void startStatistics(FestivalGate gate) {
        FestivalStatisticsThread r = new FestivalStatisticsThread(gate);
        Thread t = new Thread(r);
        t.start();

    }

    public static void startFestival(FestivalGate gate) {
        for (int i = 0; i < 100; i++) {
            FestivalAttendeeThread r = new FestivalAttendeeThread(TicketType.getRandom(), gate);
            Thread t = new Thread(r);
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
