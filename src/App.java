public class App {
    public static void main(String[] args) throws Exception {
        CarRentalSystem c = new CarRentalSystem();
        Car car = new Car("toyota","innova","2012","black",10000);
        c.add_Car("ABC123",car);

        car = new Car("tata","nano","2018","black",10000);
        c.add_Car("XYZ",car);

        car = new Car("hyundai","suv","2011","black",10000);
        c.add_Car("PQR123",car);

        Customer cust = new Customer("rajat","9027737639");
        c.add_Customer("Cust-1", cust);

        cust = new Customer("Sarthak","7826876162");
        c.add_Customer("Cust-2", cust);

        c.displayAvailableCars();

        c.delete_car("ABC123");

        c.displayAvailableCars();

        c.rent_Car("ABC123","Cust-1");
        c.rent_Car("XYZ", "Cust-2");

         c.displayRentalHistory("Cust-1");
        c.return_Car("XYZ");
        // c.rent_Car("XYZ", "Cust-1");
        // c.return_Car("XYZ");
        // c.displayAvailableCars();

       c.displayRentalHistory("Cust-2");
    }
}
