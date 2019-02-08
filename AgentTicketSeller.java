
public class AgentTicketSeller {

    private String          name;
    private ListOfTickets   tickets;

    private int priceOfAdultTicket;
    private int priceOfChildrenTicket;

    public AgentTicketSeller( String nameT ) {

        name                    = nameT;
        tickets                 = null;
        priceOfAdultTicket      = 1000;
        priceOfChildrenTicket   = 500;

    }

    public String           getName()       { return name; }

    public ListOfTickets    getTickets()    { return tickets; }

    public void setName( String nameT )                     { name = nameT; }
    public void setListOfTickets( ListOfTickets ticketsT )  { tickets = ticketsT; }
    public String toString() {
        return  "Name: " + name + 
        "  Adults pay: " + (priceOfAdultTicket/100) + 
        " Children pay: " + (priceOfChildrenTicket/100);
    }

    public String getStateOfTickets() {
        if ( tickets == null ) {
            return "NO-TICKETS-WERE-GIVEN-TO-ME-FOR-SALE!";
        } else if ( tickets.hasTicketsLeft() == false ) {
            return "SOLD-OUT";
        } else {
            return "TICKETS-STILL-AVAILABLE";
        }
    }
    public boolean sellTicket( int priceOfTicketT ) {
        if ( getStateOfTickets() == "TICKETS-STILL-AVAILABLE" ) {
            if (    ( priceOfTicketT == priceOfAdultTicket ) && 
            ( tickets.sellTicket( priceOfTicketT ) != null)  
            ) {
                return true;

            } else if (     (priceOfTicketT == priceOfChildrenTicket) &&
            ( tickets.sellTicket( priceOfTicketT ) != null)
            ) {

                return true;

            } else {

                return false;
            }

        } else {

            return false;

        }

    }

    public int receivePhoneCallFromOwner() {

        if ( tickets != null ) {

            return tickets.getMoney();

        
        } else {
            
            return -1;
        }
    }

}
