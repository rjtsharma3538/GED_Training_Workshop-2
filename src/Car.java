public class Car {
    private String make;
    private String model;
    private String year;
    private String color;
    private int price;

    Car(String make, String model, String year, String color, int price)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String get_make()
    {
        return this.make;
    }

    public String get_model()
    {
        return this.model;
    }

    public String get_year()
    {
        return this.year;
    }

    public String get_color()
    {
        return this.color;
    }

    public int get_price()
    {
        return this.price;
    }
}
