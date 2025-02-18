package com.thinkproject.api_demo.service;

import com.thinkproject.api_demo.model.CloudVendor;
import com.thinkproject.api_demo.repository.CloudVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
    //Here we need to implement all the methods of interface.

    //To do that we need instance of Repository so that in can talk to service layer.
    //Since repository is going to talk to the DB.
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        //extra business logic here
        cloudVendorRepository.save(cloudVendor);
        return "Success in saving to DB.";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        //extra business logic here
        cloudVendorRepository.save(cloudVendor);
        return "Success in updating to DB.";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        //extra business logic here
        cloudVendorRepository.deleteById(vendorId);
        return "Success in deleting from DB.";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        //extra business logic here
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
