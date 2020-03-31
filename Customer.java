public class Customer{
    private int customerid;
    private String customername;
    private String customeraddress;
    private long creditcardnumber;
    private long mobilenumber;
    private String productname;
    private double price;
    private int quantity;
    Customer(int customerid, String customername, String customeraddress, long creditcardnumber,  long mobilenumber, String productname, double price, int quantity){
        this.customerid=customerid;
        this.customername=customername;
        this.customeraddress=customeraddress;
        this.creditcardnumber=creditcardnumber;
        this.mobilenumber=mobilenumber;
        this.productname=productname;
        this.price=price;
        this.quantity=quantity;
        
    }
    public void CustomerDetails(){
        System.out.println("customerid:"+customerid+"\ncustomername:"+customername+"\ncustomeraddress: "
        +customeraddress+"\ncreditcardnumber: "+creditcardnumber+"\nmobilenumber: "+mobilenumber+
        "\nproductname: "+productname+"\nprice: "+price+"\nquantity: "+quantity+" ");
    }
    public double rate(){
        double rate=price*(double)quantity;
        return rate;
    }
    
    public void details(){
        System.out.println("\nPrint details and rate in another method:\n");
        System.out.println("customerid:"+customerid+"\ncustomername:"+customername+"\ncustomeraddress: "
        +customeraddress+"\ncreditcardnumber: "+creditcardnumber+"\nmobilenumber: "+mobilenumber+
        "\nproductname: "+productname+"\nprice: "+price+"\nquantity: "+quantity+"\n rate: "+rate()+"/-");
        
        
    }
    
    public static void main(String[] args){
       Customer o1= new Customer(1, "siva", "Vijayawada", 12345, 970346443, "bananas", 100, 2);
        o1.CustomerDetails();
        o1.rate();
        o1.details();
    }
}
