import java.util.Date;

public class AirplaneTicket {
    private String fullName;
    private String airline;
    private Date departureDate;
    private Date arrivalDate;

    public AirplaneTicket(String fullName, String airline, Date departureDate, Date arrivalDate) {
        this.fullName = fullName;
        this.airline = airline;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
    }

    public void reserveTicket() {
        System.out.println("An " + airline + " airplane ticket was reserved for " + fullName + ".");
    }

    public void cancelTicket() {
        System.out.println(fullName + " airplane ticket was canceled!");
    }
}
