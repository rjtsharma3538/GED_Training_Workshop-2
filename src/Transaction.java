public class Transaction {
    private Car car;
    private Customer customer;
    private String rentDate;
    private String returnDate;
    private int rentDuration;

    Transaction(Car car, Customer customer, String rentDate, String returnDate, int rentDuration) {
        this.car = car;
        this.customer = customer;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.rentDuration = rentDuration;
    }

    public Car get_Car() {
        return car;
    }

    public Customer get_Customer() {
        return customer;
    }

    public String get_RentDate() {
        return rentDate;
    }

    public String get_ReturnDate() {
        return returnDate;
    }

    public int get_RentalDuration() {
        return rentDuration;
    }

}
