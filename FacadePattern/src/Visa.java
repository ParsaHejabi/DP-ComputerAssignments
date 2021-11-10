import java.util.Date;

public class Visa {
    private String fullName;
    private String country;
    private Date startDate;
    private Date endDate;

    public Visa(String fullName, String country, Date startDate, Date endDate) {
        this.fullName = fullName;
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void approveVisa() {
        System.out.println("Visa for " + fullName + " from: " + startDate.toString() + " to: " + endDate.toString() + " in " + country + " is approved!");
    }

    public void expireVisa() {
        System.out.println("Visa for " + fullName + " in " + country + " is expired!");
    }
}
