import java.util.ArrayList;

public class ListOfSeats extends ArrayList<Seat> {

    private int     numberOfSeats;
    private String  nameOfPlace;

    public ListOfSeats( int     numberOfSeatsT,
                        String  nameOfPlaceT    ) {

        numberOfSeats   = numberOfSeatsT;
        nameOfPlace     = nameOfPlaceT;

        for ( int i = 1; i <= numberOfSeatsT; i++ ) {

            Seat newSeat = new Seat( generateCodeForSeats( nameOfPlace ) + " Seat: " + i );

            this.add( newSeat );

        }

    }
    
    public int      getNumberOfSeats()  { return numberOfSeats; }
    public String   getNameOfPlace()    { return nameOfPlace; }
    
    public void setNumberOfSeats( int numberOfSeatsT ) { numberOfSeats  = numberOfSeatsT; }
    public void setNameOfPlace( String nameOfPlaceT  ) { nameOfPlace    = nameOfPlaceT; }
    
    public String toString() {
        
        String strOfSeats = "";
        
        for ( int i = 0; i < this.size(); i++ ) {
            
            strOfSeats += this.get( i ).toString() + "\n";

        }

    
        return  "Number of Seats: " + numberOfSeats + "\n" +
                "Name of Place: " + nameOfPlace + "\n" +
                strOfSeats;

    }
    
    private String generateCodeForSeats( String originalNameOfPlaceT ) {
        
        String code = "";
    
        String[] words = originalNameOfPlaceT.trim().toUpperCase().split( " " );
        
        for ( String each: words ) {
            
            code += each.charAt( 0 );
        
        }
        
        return code;
    
    }
    

    public int getAvailableSeats() {
        
        int numberAvalSeats = 0;
        
        for ( Seat each: this ) {
            
            if ( each.getIsTaken() == false ) {
                
                numberAvalSeats++;
                
            }
        
        }

        return numberAvalSeats;
    }

  
  
  
    public static void main(String[] args) {


    }
}
