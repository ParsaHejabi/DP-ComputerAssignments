import java.util.Date;

public class Hotel {
    private String fullName;
    private String hotelName;
    private Date checkInDate;
    private Date checkOutDate;

    public Hotel(String fullName, String hotelName, Date checkInDate, Date checkOutDate) {
        this.fullName = fullName;
        this.hotelName = hotelName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public void reserveHotel() {
        System.out.println("Hotel " + hotelName + " for " + fullName + " is reserved.");
    }

    public void cancelHotel() {
        System.out.println(fullName + " hotel reservation was canceled!");
    }
}
