package com.ashish.restdemo.controller;

import com.ashish.restdemo.model.CloudVendor;
import com.ashish.restdemo.service.CloudVendorAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ashish")
public class CloudVendorController {

    @Autowired
    private CloudVendorAPIService cloudVendorAPIService;

    @GetMapping("{vendorId}")
    public CloudVendor getVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorAPIService.getCloudVendor(vendorId);

    }

    @GetMapping
    public List<CloudVendor> getAllCloudVendor(){
        return cloudVendorAPIService.getAllCloudVendor();
    }

    @PostMapping
    public String createVendor(@RequestBody CloudVendor cloudVendor){
        return cloudVendorAPIService.createCloudVendor(cloudVendor);
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        return cloudVendorAPIService.updateCloudVendor(cloudVendor);
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendor(@PathVariable("vendorId") String vendorId){
        return cloudVendorAPIService.DeleteCloudVendor(vendorId);
    }
}
