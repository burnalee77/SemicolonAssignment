import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {
    private Ticket burnaTicket;
    private Ticket leeTicket;
    private Ticket baluTicket;

    @BeforeEach
    public void setUp() {
        burnaTicket = new Ticket();
        burnaTicket.setTicketid();

    }

    @Test
    public void getTicketId() {
        assertEquals(1, burnaTicket.getTicketid());
    }


    @Test
    public void createTicketWithParameters() {
        leeTicket = new Ticket(2);
        assertEquals(2, leeTicket.getTicketid());
    }

    @Test
    public void createTicketWithPssengerName() {
        baluTicket = new Ticket(3);
    assertEquals(3,baluTicket.getTicketid());
    }




}