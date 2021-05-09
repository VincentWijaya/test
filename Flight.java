package Core;

import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Flight {

    public PlaneData plane = new PlaneData();
    public String flightNo;
    public String destinationAirport;
    public String departureAirport;
    public Date flightDate;
    public String arriveTime;
    public String departTime;
    public List<Passenger> passenger = new Vector<Passenger>();

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public List<Flight> getAllFlight()
    {
        List<Flight> result = new Vector<Flight>();
        
        //process to collect data
        Flight f1 = new Flight();
        f1.setPassenger(new Passenger().getAllPassenger());
        f1.setArriveTime("11:20 PM");
        f1.setDepartTime("05:25 PM");
        f1.setDepartureAirport("SUB");
        f1.setDestinationAirport("HKG");
        f1.setCapacity(120);
        f1.setFlightDate(new Date("2017-05-12"));
        f1.setFlightNo("GA-213");
        f1.setPlaneNo("GFP-1009");
        f1.setPlaneName("Garuda Airline Boeing 737");
        result.add(f1);

        Flight f2 = new Flight();
        f2.setPassenger(new Passenger().getAllPassenger());
        f2.setArriveTime("07:00 AM");
        f2.setDepartTime("09:15 PM");
        f2.setDepartureAirport("PLW");
        f2.setDestinationAirport("CKG");
        f2.setCapacity(90);
        f2.setFlightDate(new Date("2017-06-22"));
        f2.setFlightNo("LN-719");
        f2.setPlaneNo("LFP-1009");
        f2.setPlaneName("Lion Airline Boeing 737");
        result.add(f2);

        Flight f3 = new Flight();
        f3.setPassenger(new Passenger().getAllPassenger());
        f3.setArriveTime("03:25 AM");
        f3.setDepartTime("09:15 AM");
        f3.setDepartureAirport("CKG");
        f3.setDestinationAirport("PKG");
        f3.setCapacity(150);
        f3.setFlightDate(new Date("2017-08-02"));
        f3.setFlightNo("GA-715");
        f3.setPlaneNo("GFP-1021");
        f3.setPlaneName("Garuda Airbus");
        result.add(f3);

        return result;
    }

}
