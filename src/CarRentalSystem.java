import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarRentalSystem {

    Map<String, Boolean> CarAvailable;
    Map<String, Car> CarMap;
    Map<String, Customer> CustomerMap;
    Map<String, Transaction> RentalHistory;

    public CarRentalSystem() {
        this.CarAvailable = new HashMap<>();
        this.CarMap = new HashMap<>();
        this.CustomerMap = new HashMap<>();
        this.RentalHistory = new HashMap<>();
    }

    public void add_Car(String Car_id, Car car) {
        CarAvailable.put(Car_id, true);
        CarMap.put(Car_id, car);
        System.out.println("Car " + Car_id + " registered");
    }

    public void update_Car(String Car_id, Car newCar) {
        if (CarMap.containsKey(Car_id)) {
            CarMap.put(Car_id, newCar);
            System.out.println("Car " + Car_id + " updated");
        }
    }

    public void delete_car(String Car_id) {
        int cnt = 0;
        if (CarMap.containsKey(Car_id)) {
            CarMap.remove(Car_id);
            System.out.println(Car_id + " removed from Cars database");
            cnt++;
        }
        if (CarAvailable.containsKey(Car_id)) {
            CarAvailable.remove(Car_id);
            System.out.println(Car_id + " removed from available Cars database");
            cnt++;
        }

        if (cnt == 0)
            System.out.println("invalid request");
    }

    public void add_Customer(String Customer_id, Customer customer) {
        CustomerMap.put(Customer_id, customer);
        System.out.println("Customer " + Customer_id + "added");
    }

    public void update_Customer(String Customer_id, Customer newCustomer) {
        if (CustomerMap.containsKey(Customer_id)) {
            System.out.println("Customer " + Customer_id + " updated");
            CustomerMap.put(Customer_id, newCustomer);
        }
    }

    public void delete_Customer(String Customer_id) {
        if (CustomerMap.containsKey(Customer_id)) {
            CustomerMap.remove(Customer_id);
            System.out.println(Customer_id + "removed from Customers Database");
        } else
            System.out.println("invalid request");
    }

    public void rent_Car(String Car_id, String Customer_id) {
        if (CarAvailable.containsKey(Car_id)) {
            if (CarAvailable.get(Car_id)) {
                System.out.println("Car is available for rent");
                CarAvailable.put(Car_id, false);

                Scanner sc = new Scanner(System.in);
                
                System.out.println("select today date");
                String rentDate = sc.nextLine();
               
                System.out.println("select return date");
                String returnDate = sc.nextLine();

                System.out.println("enter number of days u want it for rent");
                int rentDuration = sc.nextInt();
                Car car = CarMap.get(Car_id);
                Customer cust = CustomerMap.get(Customer_id);
                Transaction t = new Transaction(car, cust, rentDate, returnDate, rentDuration);
                RentalHistory.put(Car_id, t);
                System.out.println("Car " + Car_id + " rented");
            } else
                System.out.println("car " + Car_id + " not availalble for rent");
        } else
            System.out.println("invalid car request");
    }

    public void return_Car(String Car_id) {
        if (CarAvailable.containsKey(Car_id) && !CarAvailable.get(Car_id)) {
            CarAvailable.put(Car_id, true);
            System.out.println("Car " + Car_id + " returned");
        } else
            System.out.println("invalid request");
    }

    public void displayAvailableCars() {
        System.out.println("Available Cars : ");
        for (Map.Entry<String, Boolean> entry : CarAvailable.entrySet()) {
            if (entry.getValue())
                System.out.println(entry.getKey());
        }
    }

    public void displayRentalHistory(String Customer_id) {
        for (Transaction transaction : RentalHistory.values()) {
            if (transaction.get_Customer().equals(CustomerMap.get(Customer_id))) {
                System.out.println("Car : " + transaction.get_Car().get_make() + " Customer "
                        + transaction.get_Customer().get_name() + " rental date " + transaction.get_RentDate()
                        + "return date " + transaction.get_ReturnDate() + " price : "
                       + transaction.get_RentalDuration());
            }
        }

    }
}