import java.util.ArrayList;

// https://stackoverflow.com/questions/7823477/warning-serial-serializable-class-someclass-has-no-definition-of-serialversio

public class ListOfTickets extends ArrayList<Ticket> {
  
  private String    nameOfEvent;
  private int       originalNumberOfTickets;
  private int       numberOfTicketsSold;
  private int       money;
  
  
  public ListOfTickets( String  nameOfEventT,
                        int     originalNumberOfTicketsT ) {
                            
    nameOfEvent             = nameOfEventT;
    
    originalNumberOfTickets = originalNumberOfTicketsT;
    
    numberOfTicketsSold     = 0;
    
    money                   = 0;
    
    
    for ( int i = 1; i <= originalNumberOfTickets; i++ ) {
        
        Ticket newTicket = new Ticket( nameOfEvent + " Ticket: " + i );
        this.add( newTicket );
        
    }
    
    
  }
  
  public String getNameOfEvent()                { return nameOfEvent; }
  public int    getOriginalNumberOfTickets()    { return originalNumberOfTickets; }
  public int    getNumberOfTicketsSold()        { return numberOfTicketsSold; }
  public int    getMoney()                      { return money; }
  
  public void setNameOfEvent( String  nameOfEventT ) { nameOfEvent = nameOfEventT; }
  
  public String toString() {
      
      String strTickets = "";
      
      for ( Ticket each: this ) {
        
        strTickets += each.toString() + "\n";
        
      }
      
      return    "Event: " + nameOfEvent + " Tickets: " + originalNumberOfTickets + "\n" +
                "Sold: " + numberOfTicketsSold + " Money: " + money + "\n" +
                strTickets;
    
    
  }
  
  
  public Ticket sellTicket( int priceOfTicketT ) {
    
    if ( hasTicketsLeft() == true ) {
        
        Ticket ticketToSell = this.remove( 0 );
        
        ticketToSell.setPriceOfTicket( priceOfTicketT );

        money += priceOfTicketT;
        
        
      
        return ticketToSell;
    }
    
    return null;

  }

    
  public boolean hasTicketsLeft() {
 
      return ( this.size() >= 1 );
      
    }
  
  public int numberOfTicketsLeft() {

    return this.size();

  }

  
  public int getAvailableSeats() {
    
    
    return 0;
  }
  
  
  public static void main(String[] args) {
    
    
  }
}
