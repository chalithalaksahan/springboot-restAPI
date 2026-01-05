package org.example.controller;

import org.example.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudAPIService {

    CloudVendor cloudVendor;

    @GetMapping("{id}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return cloudVendor;
            //    CloudVendor("C1","Vendor 1","Address 1","xxxxxxxx");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor details created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor updated successfully";
    }

    @DeleteMapping("{id}")
    public String deleteCloudVendorDetails(String vendorId) {
        this.cloudVendor = null;
        return "Cloud Vendor Delete successfully";
    }

}
