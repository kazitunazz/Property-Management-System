
package ContainsEverything_Package;


public class Apartment {
    String ApartmentNo;
    int NoOfRooms;
    int Bedroom;
    int Washroom;
    double ApartmentSize;
    double PriceInLacs;
    double Rent;
    String Status;

    public Apartment() {
    }

    public Apartment(String ApartmentNo, int NoOfRooms, int Bedroom, int Washroom, double ApartmentSize, double PriceInLacs, double Rent, String Status) {
        this.ApartmentNo = ApartmentNo;
        this.NoOfRooms = NoOfRooms;
        this.Bedroom = Bedroom;
        this.Washroom = Washroom;
        this.ApartmentSize = ApartmentSize;
        this.PriceInLacs = PriceInLacs;
        this.Rent = Rent;
        this.Status = Status;
    }
    
    public Apartment(String ApartmentNo, int NoOfRooms, int Bedroom, int Washroom, double ApartmentSize, double PriceInLacs) {
        this.ApartmentNo = ApartmentNo;
        this.NoOfRooms = NoOfRooms;
        this.Bedroom = Bedroom;
        this.Washroom = Washroom;
        this.ApartmentSize = ApartmentSize;
        this.PriceInLacs = PriceInLacs;
    }
}
