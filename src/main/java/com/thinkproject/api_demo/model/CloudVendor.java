package com.thinkproject.api_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {//without @Table annotation, the table that will be expected is Cloud_Vendor.
    @Id
    String vendorId; //vendor_id would be created in db
    String vendorName; //vendor_name would be created in db
    String vendorAddress; //vendor_address would be created in db
    Integer contact; //contact would be created in db

    public CloudVendor() {
    }

    public CloudVendor(String vendorId, Integer contact, String vendorName, String vendorAddress) {
        this.vendorId = vendorId;
        this.contact = contact;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }
}
