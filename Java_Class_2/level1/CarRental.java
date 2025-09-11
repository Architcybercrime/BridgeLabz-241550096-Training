class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        return rentalDays * dailyRate;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Archit", "Honda City", 5);
        cr.display();
    }
}