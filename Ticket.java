public class Ticket {

    private String  nameOfTicket;
    private int     priceOfTicket;

    
    public Ticket( String nameOfTicketT ) {

        nameOfTicket    = nameOfTicketT;
        priceOfTicket   = 0;

    }

    
    public String   getNameOfTicket()   { return nameOfTicket; }
    public int      getPriceOfTicket()  { return priceOfTicket; }

    
    public void setPriceOfTicket( int priceOfTicketT ) {

        if ( priceOfTicketT > 0 ) {

            priceOfTicket = priceOfTicketT;

        } 

    }

    
    public String toString() {
        
        return nameOfTicket + " " + ( priceOfTicket/100 ) + " euros";
        
    }
    
    
    
    
    public static void main(String[] args) {

    }
}
