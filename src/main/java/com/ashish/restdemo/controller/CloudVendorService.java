package com.ashish.restdemo.controller;

import com.ashish.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ashish")
public class CloudVendorService {

    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getVendorDetails(String vendorId){
        return cloudVendor;
    }

    @PostMapping
    public String createVendor(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Vendor added successfully";
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "cloud vendor UPDATED Successfully ";
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendor(String vendorId){
        this.cloudVendor = null;
        return "Vendor DELETED Successfully";
    }
}
