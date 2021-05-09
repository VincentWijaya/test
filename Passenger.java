package Core;

import java.util.List;
import java.util.Vector;

public class Passenger extends Flight {

    private String passengerName;
    private String bookingCode;
    private String identityNumber;

    public List<Passenger> getAllPassenger()
    {
        List<Passenger> result = new Vector<Passenger>();
        
        Passenger p1 = new Passenger();
        p1.setBookingCode("GYIKJN");
        p1.setIdentityNumber("18271097020001");
        p1.setPassengerName("Andi Muliadi");
        result.add(p1);

        Passenger p2 = new Passenger();
        p2.setBookingCode("ZNJGQK");
        p2.setIdentityNumber("79812539720001");
        p2.setPassengerName("Budi Dirgantara");
        result.add(p2);

        Passenger p3 = new Passenger();
        p3.setBookingCode("VFZWAQ");
        p3.setIdentityNumber("56783128960002");
        p3.setPassengerName("Wisnu Dwi Perdana");
        result.add(p3);

        return result;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public List<Flight> getPassengerDetailFlightInformation()
    {
        List<Flight> result = new Vector<Flight>();

        List<Flight> allFlight = new Flight().getAllFlight();

        for(int i=0;i<allFlight.size();i++)
        {
            for(int j=0;j<allFlight.get(i).getPassenger().size();j++)
            {
                if(allFlight.get(i).getPassenger().get(j).equals(this))
                    result.add(allFlight.get(i));
            }
        }

        return result;
    }
    
    public void setPassenger(List<Passenger> passenger)
    {
        this.passenger = passenger;
    }

    public void addPassenger(Passenger passenger)
    {
        this.passenger.add(passenger);
    }

    public void removePassenger(Passenger passenger)
    {
        this.passenger.remove(passenger);
    }
}
