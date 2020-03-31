public class CustomerSix{
    private int customerid;
    private String customername;
    private String customeraddress;
    private long creditcardnumber;
    private long mobilenumber;
    private String productname;
    private double price;
    private int quantity;
    CustomerSix(int customerid, String customername, String customeraddress, long creditcardnumber,  long mobilenumber, String productname, double price, int quantity){
        this.customerid=customerid;
        this.customername=customername;
        this.customeraddress=customeraddress;
        this.creditcardnumber=creditcardnumber;
        this.mobilenumber=mobilenumber;
        this.productname=productname;
        this.price=price;
        this.quantity=quantity;
}
public void setId(int id){
    customerid=id;
    
}
public int getId(){
   return customerid;
    
}
public void setName(String name) {
    customername=name;
}
public String getName(){
    return customername;
}
public void setAddress(String address){
    customeraddress=address;
}
public String getAddress(){
    return customeraddress;
}
public void SetCnumber(long cnumber){
    creditcardnumber=cnumber;
}
public long getCnumber(){
    return creditcardnumber;
}
public void setMnumber(long mnumber){
    mobilenumber=mnumber;
    
}
public long GetMnumber(){
    return mobilenumber;
}
public void setPname(String pname){
    productname=pname;
}
public String getPname(){
    return productname;
}

public void setPrice(double Price){
    price=Price;
}
public double getPrice(){
    return price;
}
public void setQuantity(int Quantity){
    quantity=Quantity;
}
public int getQuantity(){
    return quantity;
    
}
public String toString(){
    return "customerid:"+" " + customerid+"\ncustomername:"+customername+"\ncustomeraddress: "
        +customeraddress+"\ncreditcardnumber: "+creditcardnumber+"\nmobilenumber: "+mobilenumber+
        "\nproductname: "+productname+"\nprice: "+price+"\nquantity: "+quantity+" ";
}
    
    public double rate(){
        double rate=price*(double)quantity;
        System.out.println("rate is: "+rate);
        return rate;
    }
    
    
    public static void main(String[] args){
       CustomerSix o1= new CustomerSix(1, "siva", "Vijayawada", 12345, 970346443, "bananas", 100, 2);
       CustomerSix o2=o1;
       System.out.println(o2);
        o2.rate();
     
    }
}
