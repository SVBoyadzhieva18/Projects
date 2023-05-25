import java.time.LocalDate;
import java.util.Scanner;

public class Manufacturer {
    private int firmNumber;
    private String firmName;
    private String firmAddress;
    private String firmPhoneNumber;
    private static int firmId=4;

    public Manufacturer(int firmNumber, String firmName, String firmAddress, String firmPhoneNumber) {
        this.firmNumber = firmNumber;
        this.firmName = firmName;
        this.firmAddress = firmAddress;
        this.firmPhoneNumber = firmPhoneNumber;
    }

    public int getFirmNumber() {
        return firmNumber;
    }

    public void setFirmNumber(int firmNumber) {
        this.firmNumber = firmNumber;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getFirmAddress() {
        return firmAddress;
    }

    public void setFirmAddress(String firmAddress) {
        this.firmAddress = firmAddress;
    }

    public String getFirmPhoneNumber() {
        return firmPhoneNumber;
    }

    public void setFirmPhoneNumber(String firmPhoneNumber) {
        this.firmPhoneNumber = firmPhoneNumber;
    }

    @Override
    public String toString() {
        return this.firmNumber+" , "+this.firmName + " , " + this.firmPhoneNumber + " , " + this.firmAddress;
    }

    public static void addNewManufacturer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=input.nextLine();
        System.out.println("Enter the address: ");
        String address=input.nextLine();
        System.out.println("Enter the phone number: ");
        String phoneNumber=input.nextLine();
        Main.manufacturers.add(new Manufacturer(firmId, name, address, phoneNumber));
        firmId++;
    }
}
