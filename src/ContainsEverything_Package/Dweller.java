
package ContainsEverything_Package;

public class Dweller {
    String DwellerId;
    String Name;
    int	NoOfPeopleLiving;
    String BackUpAddress;
    String ContactNo;
    String emailId;
    String RentingDate;
    String DwellerType;

    public Dweller() {
    }

    public Dweller(String Name, String DwellerType)
    {
        this.Name=Name;
        this.DwellerType=DwellerType;
    }
    
    public Dweller(String Name, String ContactNo, String DwellerType)
    {
        this.Name=Name;
        this.ContactNo=ContactNo;
        this.DwellerType=DwellerType;
    }
    
    
    public Dweller(String DwellerId, String Name, int NoOfPeopleLiving, String BackUpAddress, String ContactNo, String emailId, String RentingDate, String DwellerType) {
        this.DwellerId = DwellerId;
        this.Name = Name;
        this.NoOfPeopleLiving = NoOfPeopleLiving;
        this.BackUpAddress = BackUpAddress;
        this.ContactNo = ContactNo;
        this.emailId = emailId;
        this.RentingDate = RentingDate;
        this.DwellerType = DwellerType;
    }
    
    
    
}
