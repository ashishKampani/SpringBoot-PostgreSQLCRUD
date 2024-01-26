package com.ashish.restdemo.service.impl;

import com.ashish.restdemo.model.CloudVendor;
import com.ashish.restdemo.repository.CloudVendorRepository;
import com.ashish.restdemo.service.CloudVendorAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorAPIService {
    //Service OR Business layer
    @Autowired
    private CloudVendorRepository cloudVendorRepository;

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully CREATED";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully UPDATED";
    }

    @Override
    public String DeleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Successfully DELETED";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
