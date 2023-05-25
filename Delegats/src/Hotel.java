 public class Hotel {
        private String name;
        private int roomNumber;
        private double roomPrice;

        public Hotel(String name, int roomNumber, double roomPrice) {
            this.name = name;
            this.roomNumber = roomNumber;
            this.roomPrice = roomPrice;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRoomNumber() {
            return roomNumber;
        }

        public void setRoomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
        }

        public double getRoomPrice() {
            return roomPrice;
        }

        public void setRoomPrice(double roomPrice) {
            this.roomPrice = roomPrice;
        }

     @Override
     public String toString() {
         return "Hotel: " +
                 "name: " + name + '\'' +
                 "roomNumber: " + roomNumber +
                 "roomPrice: " + roomPrice;
     }
 }
