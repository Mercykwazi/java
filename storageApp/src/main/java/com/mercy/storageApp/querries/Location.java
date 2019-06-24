
package com.mercy.storageApp.querries;

import javax.persistence.*;

@Entity
@Table(name = "location")

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public void locationDetails(int id, String address1, String address2, String country, int businessId) {
        this.id = id;
        this.address1 = address1;
        this.address2 = address2;
        this.country = country;
        this.businessId = businessId;
    }
}