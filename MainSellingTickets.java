
/**
 * Write a description of class MainSellingTickets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class MainSellingTickets
{
    public static void main( String[] args ) {

        clearScreen();
        System.out.println( "Welcome to the Ticket Selling Simulation!\n" );

        // SETUP SHOW
        Room teatroSaDaBandeira = new Room( "Teatro Sa da Bandeira", 50, 200, 200, 5 );
        Show myShow = new Show( "My Show" );
        myShow.addMostRecentRoomForShow( teatroSaDaBandeira );
        myShow.setTickets();
        //System.out.println( myShow );

        // SETUP TICKET SELLER AGENT 
        AgentTicketSeller seller = new AgentTicketSeller( "Brian Tracy" );
        seller.setListOfTickets( myShow.getListOfTickets() );
        //System.out.println( seller );

        // BEGIN SELLING PROCESS
        System.out.println( seller.getName() + " stars with: " + seller.getTickets().size() + " tickets!" );
        System.out.println( seller.getName() + " stars with: " + seller.getTickets().getMoney()/100 + " euros!\n" );

        while ( seller.getStateOfTickets().equalsIgnoreCase( "TICKETS-STILL-AVAILABLE" )) {

            //long miliseconds = (int) Math.random() * 1000;

            try {

                Thread.sleep( waitForClient() );

            } catch(Exception e) {

            }

            int moneyPayed = chooseTypeOfTicket();

            seller.sellTicket( moneyPayed );

            String strChoice = (moneyPayed == 1000)?"Adult":"Children";

            System.out.println( seller.getName() + " sold a " + strChoice + " ticket !" ); 

            if ( phoneCall() == true ) {

                System.out.println( "\nPhone is ringing!!!" );
                System.out.println(     "Hello Boss, I sold " + 
                    ( seller.getTickets().getMoney()/100 ) + 
                    " euros worth of tickets until now!\n" );

            }
        }
        System.out.println( "\n" );
        System.out.println( seller.getName() + " ends up with: " + seller.getTickets().size() + " tickets!" );
        System.out.println( seller.getName() + " ends up with: " + seller.getTickets().getMoney()/100 + " euros!" );

        System.out.println( "Thank you, have a nice day!" );

    }

    private static int chooseTypeOfTicket() {

        int priceForAdultInCents = 1000;
        int priceForChildrenInCents = 500;

        double rndm = Math.random();

        if ( rndm <= 0.75 ) {
            return priceForAdultInCents;
        } else {
            return priceForChildrenInCents;
        }
    }

    private static long waitForClient() {

        long miliseconds = 0 ;

        double rnd = Math.random();

        if ( rnd <= 0.25 ) {

            miliseconds = 1000;

        } else if ( rnd <= 0.50 ) {

            miliseconds = 2000;

        } else if ( rnd <= 0.75 ) {
            
            miliseconds = 3000;
            
        } else {
            
            miliseconds = 3000;
            
        }
        
        return miliseconds;
    }

    private static boolean phoneCall() {
        
        double randomNumber= Math.random();
        
        if ( randomNumber <= 0.05 ) {
            
            return true;
            
        } else {

            return false;

        }

    }

    private static void clearScreen() {  
        System.out.print("\033\033");  
        System.out.flush();  

        // https://stackoverflow.com/questions/2979383/java-clear-the-console

    }  

}
