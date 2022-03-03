
package ContainsEverything_Package;

public class Owner {
    String OwnerId;
    String Name;
    String Address;
    String ContactNo;
    String emailId;

    public Owner() {
    }
    
    public Owner(String OwnerId, String Name, String ContactNo)
    {
        this.OwnerId=OwnerId;
        this.Name=Name;
        this.ContactNo=ContactNo;
    }
    
    public Owner(String OwnerId, String Name)
    {
        this.OwnerId=OwnerId;
        this.Name=Name;
    }


    public Owner(String OwnerId, String Name, String Address, String ContactNo, String emailId) {
        this.OwnerId = OwnerId;
        this.Name = Name;
        this.Address = Address;
        this.ContactNo = ContactNo;
        this.emailId = emailId;
    }
}
