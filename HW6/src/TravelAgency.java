import java.util.Date;

public class TravelAgency {
    private static Visa visa;
    private static AirplaneTicket airplaneTicket;
    private static Hotel hotel;
    private static CarRentalAgency carRentalAgency;

    public TravelAgency(String fullName, Date startDate, Date endDate, String country, String airline, String hotelName, String carModel) {
        visa = new Visa(fullName, country, startDate, endDate);
        airplaneTicket = new AirplaneTicket(fullName, airline, startDate, endDate);
        hotel = new Hotel(fullName, hotelName, startDate, endDate);
        carRentalAgency = new CarRentalAgency(fullName, carModel, startDate, endDate);
    }

    public void makeTrip() {
        visa.approveVisa();
        airplaneTicket.reserveTicket();
        hotel.reserveHotel();
        carRentalAgency.rentCar();
    }

    public void endTrip() {
        visa.expireVisa();
        airplaneTicket.cancelTicket();
        hotel.cancelHotel();
        carRentalAgency.rentCarExpired();
    }
}
