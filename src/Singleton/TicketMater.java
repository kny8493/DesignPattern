package Singleton;

public class TicketMater {
    private static TicketMater ticketMater = new TicketMater();
    private static int ticket = 100;

    public static int getNextTicket() {
        return ticket++;
    }

    public static TicketMater getInstance() {
        return ticketMater;
    }
}