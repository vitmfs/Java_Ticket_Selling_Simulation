import java.util.ArrayList;

public class Show {
 
  private String        nameOfShow;
  private ListOfRooms   rooms;
  private ListOfTickets tickets;

 
  
  public Show( String nameOfShowT ) {
    
    nameOfShow  = nameOfShowT;
    
    rooms       = new ListOfRooms( nameOfShowT );
    
    tickets = null;
    
  }
  
  
  public String         getMameOfShow()     { return nameOfShow; }
  public ListOfRooms    getListOfRooms()    { return rooms; }
  public ListOfTickets  getListOfTickets()  { return tickets;}
  
  
  
  public void setNameOfShow( String nameOfShowT ) { nameOfShow = nameOfShowT; }
  public boolean setTickets() {
      
      if (  rooms != null && 
            rooms.size() >= 1   ) {
        
        int numberOfTickets = rooms.get( 0 ).getCapacity();
        
        tickets = new ListOfTickets( nameOfShow, numberOfTickets );
        
        return true;
        
      } 
      
      return false;

  }
  
  
  public String toString() {
      
      String strRooms = "";
      
      if ( rooms != null ) {
          
          strRooms += rooms.toString();

      }
      
      String strTickets = "";
      
      if ( tickets != null ) {
          
          strTickets += tickets.toString();

      }
      
      
      return    "Name of Show: " + nameOfShow + "\n" +
                strRooms + "\n" + 
                strTickets + "\n";
    
    
    
    
  }
  
  
  
  
  public boolean addMostRecentRoomForShow( Room newRoomT ) {
    
      if (  rooms != null && 
            newRoomT != null ) {
          
          rooms.add( 0, newRoomT );
          
          return true;
        
      }
      
      return false;

  }
  
 
 
 
 
  public static void main(String[] args) {
    
    
  }
}
