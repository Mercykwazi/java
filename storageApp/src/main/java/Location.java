import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement ;

public class Location {
    private int id;

    public int getId() {
        return id;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCountry() {
        return country;
    }

    public int getBusinessId() {
        return businessId;
    }
    private String address1;
    private String address2;
    private String country;
    private int businessId;

  public void  locationDetails(int id, String address1, String address2, String country, int businessId) {
        Database db=new Database();
        this.id = id;
        this.address1 = address1;
        this.address2 = address2;
        this.country = country;
        this.businessId = businessId;
        Connection conn = null;
        Connection stmnt=db.connect();
        try {
            PreparedStatement sql =stmnt.prepareStatement("INSERT INTO location (id,address1,address2,country,business_id) "
                    + "VALUES (?,?,?,?,?)");
            sql.setInt(1,id);
            sql.setString(2,address1);
            sql.setString(3,address2);
            sql.setString(4,country);
            sql.setInt(5,businessId);
            sql.executeUpdate();
            sql.close();

        } catch ( SQLException e ) {
            e.printStackTrace();
        }
//        sql.setInt(1,id);

    }


    //no arg constructor
    //@GetMapping("/location/{}");
}
