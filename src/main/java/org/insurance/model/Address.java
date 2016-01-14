/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insurance.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author user1
 */
@Embeddable
public class Address {

	@Column(name="HOUSE_NUMBER")
    private String houseNo;
	@Column(name="STREET")
	private String street;
	@Column(name="CITY")
    private String city;
	@Column(name="ZIP_CODE")
    private int zip;
    
  

    public String getHouseNo() {
        return houseNo;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZip() {
        return zip;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public void setStreet(String Street) {
        this.street = Street;
    }

    public void setCity(String City) {
        this.city = City;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Address(){
    	
    }
    
    public String toString(){  
        return houseNo+" "+street+" "+city;  
    }  

}
