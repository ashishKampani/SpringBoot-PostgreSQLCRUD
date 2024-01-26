package com.ashish.restdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
//@Table(name = "cloudVendor")
public class CloudVendor {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long VendorId;

    private String VendorName;

    private String VendorAddress;

    private String VendorPhoneNumber;

    public CloudVendor() {
    }

    public CloudVendor(Long vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        VendorId = vendorId;
        VendorName = vendorName;
        VendorAddress = vendorAddress;
        VendorPhoneNumber = vendorPhoneNumber;
    }

    public Long getVendorId() {
        return VendorId;
    }

    public void setVendorId(Long vendorId) {
        VendorId = vendorId;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return VendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        VendorPhoneNumber = vendorPhoneNumber;
    }
}
