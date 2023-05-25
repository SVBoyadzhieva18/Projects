import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conference conference = new Conference();

        boolean running = true;
        while (running) {
            System.out.println("1. Add delegate, hotel data and delegate card");
            System.out.println("2. Print all delegate and hotel data");
            System.out.println("3. Get total hotel expenses for delegates from a specific city");
            System.out.println("4. Get the earliest arrived male delegate and his hotel information");
            System.out.println("5. Get delegates from a specific city");
            System.out.println("6. Get delegate information by room number");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter delegate name: ");
                    String name = sc.next();
                    System.out.print("Enter EGN: ");
                    String egn = sc.next();
                    System.out.print("Enter city: ");
                    String city = sc.next();
                    System.out.print("Enter travel expenses: ");
                    double travelExpenses = sc.nextDouble();
                    System.out.print("Enter hotel name: ");
                    String hotelName = sc.next();
                    System.out.print("Enter room number: ");
                    int roomNumber = sc.nextInt();
                    System.out.print("Enter night rate: ");
                    double nightRate = sc.nextDouble();
                    System.out.print("Enter delegate card number: ");
                    String delegateNumber = sc.next();
                    System.out.print("Enter arrival data: ");
                    String arrivalData = sc.next();
                    System.out.print("Enter departure date: ");
                    String departureDate = sc.next();
                    conference.addDelegate(new Delegate(name, egn, city, travelExpenses), new Hotel(hotelName, roomNumber, nightRate), new DelegationCard(delegateNumber, arrivalData,departureDate));
                    break;
                case 2:
                    conference.printAllData();
                    break;
                case 3:
                    System.out.print("Enter city: ");
                    city = sc.next();
                    System.out.println("Total hotel expenses for delegates from " + city + ": " + conference.calculateTotalHotelExpenses(city));
                    break;
                case 4:
                    Delegate earliestArrivedMaleDelegate = conference.getEarliestArrivalDelegateData();
                    if (earliestArrivedMaleDelegate != null) {
                        System.out.println("Name: " + earliestArrivedMaleDelegate.getName());
                        System.out.println("EGN: " + earliestArrivedMaleDelegate.getEGN());
                        System.out.println("Hotel: " + earliestArrivedMaleDelegate.getHotel().getName());
                        System.out.println("Room number: " + earliestArrivedMaleDelegate.getHotel().getRoomNumber());
                        System.out.println("Night rate: " + earliestArrivedMaleDelegate.getHotel().getNightRate());
                    } else {
                        System.out.println("No male delegate found!");
                    }
                    break;
                case 5:
                    System.out.print("Enter city: ");
                    city = sc.next();
                    for (Delegate d : conference.getDelegatesFromCity(city)) {
                        System.out.println("Name: " + d.getName());
                        System.out.println("EGN: " + d.getEGN());
                        System.out.println("City: " + d.getHometown());
                        System.out.println("Travel Expenses: " + d.getTravelExpenses());
                    }
                    break;
                case 6:
                    System.out.print("Enter room number: ");
                    roomNumber = sc.nextInt();
                    Delegate delegate = conference.getDelegateDataByRoomNumber(roomNumber);
                    if (delegate != null) {
                        System.out.println("Name: " + delegate.getName());
                        System.out.println("EGN: " + delegate.getEGN());
                        System.out.println("City: " + delegate.getHometown());
                        System.out.println("Travel Expenses: " + delegate.getTravelExpenses());
                    } else {
                        System.out.println("No delegate found for that room number!");
                    }
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        sc.close();
    }
}