package com.thinkproject.api_demo.controller;

import com.thinkproject.api_demo.model.CloudVendor;
import com.thinkproject.api_demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIController {

    //controller talks to service layer.
    //service layer talks to repository layer.
    //so here create instance of service layer and use it in constructor.
    CloudVendorService cloudVendorService;

    public CloudVendorAPIController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    // Path-variable annotation would assign the value to of path variable to local variable pgmVendorId.
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String pgmVendorId){
        return cloudVendorService.getCloudVendor(pgmVendorId);
        //return new CloudVendor("VID01", 7755, "aws", "california");
    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendors();
        //return new CloudVendor("VID01", 7755, "aws", "california");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        return cloudVendorService.createCloudVendor(cloudVendor);
//        return "Created new vendor details successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        return cloudVendorService.updateCloudVendor(cloudVendor);
//        return "Updated vendor details successfully";
    }


}
