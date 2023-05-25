import java.util.ArrayList;

    public class Pharmacy {
        private ArrayList<Medicine> medicineList = new ArrayList<>();

        public void addMedicine(Medicine medicine) {
            medicineList.add(medicine);
        }

        public void displayAllMedicines() {
            for (Medicine medicine : medicineList) {
                medicine.displayInfo();
                System.out.println("-----------------");
            }
        }


        public void displayAllProviders() {
            for (Medicine medicine : medicineList) {
                Provider provider = medicine.getProvider();
                if (provider != null) {
                    provider.displayInfo();
                    System.out.println("-----------------");
                }
            }
        }

        public void displayAllManufacturers() {
            for (Medicine medicine : medicineList) {
                Manufacturer manufacturer = medicine.getManufacturer();
                if (manufacturer != null) {
                    manufacturer.displayInfo();
                    System.out.println("-----------------");
                }
            }
        }

        public void displayAllImporters() {
            for (Medicine medicine : medicineList) {
                Importer importer = medicine.getImporter();
                if (importer != null) {
                    importer.displayInfo();
                    System.out.println("-----------------");
                }
            }
        }

        public void displayMedicinesByManufacturer(String manufacturerName, double maxPrice) {
            for (Medicine medicine : medicineList) {
                Manufacturer manufacturer = medicine.getManufacturer();
                if (manufacturer != null && manufacturer.getName().equals(manufacturerName) && medicine.getPrice() <= maxPrice) {
                    medicine.displayInfo();
                    System.out.println("-----------------");
                }
            }
        }

        public ArrayList<Medicine> getMedicinesByImporter(String importerName) {
            ArrayList<Medicine> filteredMedicineList = new ArrayList<>();
            for (Medicine medicine : medicineList) {
                Importer importer = medicine.getImporter();
                if (importer != null && importer.getName().equals(importerName)) {
                    filteredMedicineList.add(medicine);
                }
            }
            return filteredMedicineList;
        }

        public ArrayList<Importer> getAllImporters() {
            ArrayList<Importer> importerList = new ArrayList<>();
            for (Medicine medicine : medicineList) {
                Importer importer = medicine.getImporter();
                if (importer != null && !importerList.contains(importer)) {
                    importerList.add(importer);
                }
            }
            return importerList;
        }

        public ArrayList<Provider> getAllProviders() {
            return null;
        }

        public ArrayList<Manufacturer> getAllManufacturers() {
            return null;
        }
    }
