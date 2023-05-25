import java.util.Date;

public class DelegationCard {
    private String delegateNumber;
    private Date arrivalDate;
    private Date departureDate;

    public DelegationCard(String delegateNumber, Date arrivalDate, Date departureDate) {
        this.delegateNumber = delegateNumber;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
    }

    public String getDelegateNumber() {
        return delegateNumber;
    }

    public void setDelegateNumber(String delegateNumber) {
        this.delegateNumber = delegateNumber;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    @Override
    public String toString() {
        return "DelegationCard " +
                "delegateNumber: " + delegateNumber + '\'' +
                "arrivalDate: " + arrivalDate +
                "departureDate: " + departureDate;
    }
}