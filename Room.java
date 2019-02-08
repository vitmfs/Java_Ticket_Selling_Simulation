
public class Room {

    private String    nameOfRoom;
    private int       capacity;
    private double    lengthOfRoom;
    private double    widthOfRoom;
    private double    heightOfRoom;

    private ListOfSeats seats;

    public Room(    String  nameOfRoomT,
                    int     capacityT,
                    double  lengthOfRoomT,
                    double  widthOfRoomT,
                    double  heightOfRoomT    ) {

        nameOfRoom      = nameOfRoomT;
        capacity        = capacityT;
        lengthOfRoom    = lengthOfRoomT;
        widthOfRoom     = widthOfRoomT;
        heightOfRoom    = heightOfRoomT;
        
        seats = new ListOfSeats( capacity, nameOfRoom );

    }
    
    public String   getNameOfRoom()     { return nameOfRoom; }
    public int      getCapacity()       { return capacity; }
    public double   getLengthOfRoom()   { return lengthOfRoom; }
    public double   getWidthOfRoom()    { return widthOfRoom; }
    public double   getHeightOfRoom()   { return heightOfRoom; }
    
    public void setNameOfRoom( String  nameOfRoomT )    { nameOfRoom= nameOfRoomT; }
    public void setCapacity( int capacityT )            { capacity= capacityT; }
    
    public String toString() {
    
        return  "Name of Room: " + nameOfRoom + " Capacity: " + capacity + "\n" +
                seats.toString();
    
    }
    

  
  
  
    public static void main(String[] args) {
        
    }
}
