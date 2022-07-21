public class Ticket {
    private int ticketid;
    private String passengerName;
    private String destination;

    public Ticket(){}

    public Ticket(int ticketid){
        this.ticketid = ticketid;
    }


    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }


    }


