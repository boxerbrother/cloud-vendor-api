package com.thinkproject.api_demo.service;

import com.thinkproject.api_demo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    //write down list of methods that we want in our business/service layer
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String vendorId);
    public CloudVendor getCloudVendor(String vendorId);
    public List<CloudVendor> getAllCloudVendors();
}
