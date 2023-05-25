import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conference {
    private List<Delegate> delegateList;
    private List<Hotel> hotelList;
    private List<DelegationCard> delegationCardList;

    public Conference() {
        this.delegateList = null;
        this.hotelList = new ArrayList<Hotel>();
        this.delegationCardList = new ArrayList<DelegationCard>();
    }

    public Conference(ArrayList<Delegate> delegates, ArrayList<Hotel> hotels, ArrayList<DelegationCard> delegationCards) {
        this.delegateList = delegates;
        this.hotelList = hotels;
        this.delegationCardList = delegationCards;
    }

    public List<Delegate> getDelegateList() {
        return delegateList;
    }

    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public List<DelegationCard> getDelegationCardList() {
        return delegationCardList;
    }

    public void addDelegate(Delegate delegate, Hotel hotel, DelegationCard delegationCard) {
        delegateList.add(delegate);
        hotelList.add(hotel);
        delegationCardList.add(delegationCard);
    }

    public void removeDelegate(Delegate delegate) {
        int delegateIndex = delegateList.indexOf(delegate);
        if (delegateIndex >= 0) {
            delegateList.remove(delegateIndex);
            hotelList.remove(delegateIndex);
            delegationCardList.remove(delegateIndex);
        }
    }

    public double calculateTotalCostForLocation(String location) {
        double totalCost = 0;
        for (int i = 0; i < delegateList.size(); i++) {
            if (delegateList.get(i).getHometown().equals(location)) {
                totalCost += hotelList.get(i).getRoomPrice();
            }
        }
        return totalCost;
    }

    public double calculateTotalHotelExpenses(Hotel hotel, String city) {
        double totalExpenses = 0;
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getName().equals(hotel.getName()) && delegateList.get(i).getHometown().equals(city)) {
                totalExpenses += hotelList.get(i).getRoomPrice();
            }
        }
        return totalExpenses;
    }

    public Delegate getEarliestArrivalDelegateData() {
        int earliestDelegateIndex = 0;
        Date earliestArrival = delegationCardList.get(0).getArrivalDate();
        for (int i = 0; i < delegationCardList.size(); i++) {
            if (delegationCardList.get(i).getArrivalDate().before(earliestArrival)) {
                earliestArrival = delegationCardList.get(i).getArrivalDate();
                earliestDelegateIndex = i;
            }
        }
        Delegate earliestDelegate = delegateList.get(earliestDelegateIndex);
        Hotel earliestDelegateHotel = hotelList.get(earliestDelegateIndex);
        System.out.println("Earliest arriving delegate: " + earliestDelegate.getName());
        System.out.println("Hotel name: " + earliestDelegateHotel.getName());
        System.out.println("Hotel room number: " + earliestDelegateHotel.getRoomNumber());
        return earliestDelegate;
    }

    public List<Delegate> getDelegatesFromCity(String city) {
        List<Delegate> cityDelegates = new ArrayList<>();
        for (int i = 0; i < delegateList.size(); i++) {
            if (delegateList.get(i).getHometown().equals(city)) {
                cityDelegates.add(delegateList.get(i));
            }
        }
        return cityDelegates;
    }

    public Delegate getDelegateDataByRoomNumber(int roomNumber) {
        boolean isRoomOccupied = false;
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getRoomNumber() == roomNumber) {
                isRoomOccupied = true;
                Delegate delegate = delegateList.get(i);
                Hotel delegateHotel = hotelList.get(i);
                DelegationCard delegateCard = delegationCardList.get(i);
                System.out.println("Delegate name: " + delegate.getName());
                System.out.println("EGN: " + delegate.getEGN());
                System.out.println("City: " + delegate.getHometown());
                System.out.println("Travel expenses: " + delegate.getTravelExpenses());
                System.out.println("Hotel name: " + delegateHotel.getName());
                System.out.println("Room number: " + delegateHotel.getRoomNumber());
                System.out.println("Room price: " + delegateHotel.getRoomPrice());
                System.out.println("Delegation card number: " + delegateCard);
                System.out.println("Arrival date: " + delegateCard.getArrivalDate());
                System.out.println("Departure date: " + delegateCard.getDepartureDate());
                break;
            }
        }
        if (!isRoomOccupied) {
            System.out.println("The room is not occupied by any delegate.");
        }
        return null;
    }
}
