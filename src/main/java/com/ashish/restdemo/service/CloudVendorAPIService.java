package com.ashish.restdemo.service;

import com.ashish.restdemo.model.CloudVendor;

import java.util.List;

public interface CloudVendorAPIService {
    public String createCloudVendor(CloudVendor cloudVendor);

    public String updateCloudVendor(CloudVendor cloudVendor);

    public String DeleteCloudVendor(String vendorId);
    public CloudVendor getCloudVendor(String vendorId);

    public List<CloudVendor> getAllCloudVendor();

}
