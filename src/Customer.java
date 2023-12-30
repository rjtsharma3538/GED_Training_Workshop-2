public class Customer {
    private String name;
    private String contact;

    public Customer(String name, String contact)
    {   
        this.name = name;
        this.contact = contact;
    }

    public String get_name()
    {
        return this.name;
    }

    public String get_contact()
    {
        return this.contact;
    }
}
