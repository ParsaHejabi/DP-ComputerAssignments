import java.util.Date;

public class CarRentalAgency {
    private String fullName;
    private String carModel;
    private Date checkInDate;
    private Date checkOutDate;

    public CarRentalAgency(String fullName, String carModel, Date checkInDate, Date checkOutDate) {
        this.fullName = fullName;
        this.carModel = carModel;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public void rentCar() {
        System.out.println("Car model " + carModel + " for " + fullName + " is rented.");
    }

    public void rentCarExpired() {
        System.out.println(fullName + " car rental is expired!");
    }
}
