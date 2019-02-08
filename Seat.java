/**
 * The Seat class represents a seat 
 * in a show room or in an outside place
 * 
 * @author Vitor Silva
 * @version 1.0
 * @since 2018-04-25
 */
public class Seat {

    private String  codeOfSeat;
    private boolean isTaken;

    /**
     * When a seat is created it takes
     * a String representing the code
     * of the seat
     */
    public Seat( String codeOfSeatT ) {

        codeOfSeat  = codeOfSeatT;
        isTaken     = false;

    }

    /**
     * This method is used to get the
     * code of the seat
     * @return String with the seat code 
     */
    public String getCodeOfSeat()   { return codeOfSeat; }
    
    /**
     * This method is used to get
     * the state of the seat, if it is
     * taken or not
     * @return boolean true if taken false if not taken
     */
    public boolean getIsTaken()     { return isTaken; }
    
    /**
     * This method is used to change the code 
     * of the seat
     * @param codeOfSeatT is the new code for the seat
     */
    public void setCodeOfSeat( String codeOfSeatT ) { codeOfSeat    = codeOfSeatT; }
    
    /**
     * This method is used to change the state
     * of the seat in terms of being taken or not
     * @param isTakenT is the new state of the seat
     */
    public void setIsTaken( boolean isTakenT )      { isTaken       = isTakenT; }
    
    public String toString() {
        
        return  codeOfSeat + " Taken: " + isTaken;

    }
    
}

// References:
// https://www.tutorialspoint.com/java/java_documentation.htm
