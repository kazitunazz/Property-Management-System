
package ContainsEverything_Package;

public class Bill {
    int BillNo;
    String Type;
    String DueDate;
    double Amount;
    String Apartment;
    String Month;
    String Status;

    public Bill() {
    }
    
    
    
    public Bill(String Month,double Amount,String Status)
    {
        this.Month=Month;
        this.Amount=Amount;
        this.Status=Status;
    }

    public Bill(int BillNo, String Type, String DueDate, double Amount, String Apartment, String Month, String Status) {
        this.BillNo = BillNo;
        this.Type = Type;
        this.DueDate = DueDate;
        this.Amount = Amount;
        this.Apartment = Apartment;
        this.Month = Month;
        this.Status = Status;
    }
    
    public Bill(int BillNo, String Type, String DueDate, String Status) {
        this.BillNo = BillNo;
        this.Type = Type;
        this.DueDate = DueDate;
        this.Status = Status;
    }
    
    public Bill(String Type, String DueDate, double Amount, String Status) {
    
        this.Type = Type;
        this.DueDate=DueDate;
        this.Amount=Amount;
        this.Status = Status;
    }
    
    

    public Bill(String Type, String Status) {
    
        this.Type = Type;
        this.Status = Status;
    }
    
    
}

