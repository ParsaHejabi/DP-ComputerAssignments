import java.util.Date;

public class Client {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency(
                "Ali Alavi",
                new Date(),
                new Date(),
                "Canada",
                "Lufthansa",
                "Hayatt",
                "Tesla"
        );

        travelAgency.makeTrip();
    }
}
