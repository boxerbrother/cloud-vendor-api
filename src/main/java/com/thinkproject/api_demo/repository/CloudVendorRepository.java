package com.thinkproject.api_demo.repository;

import com.thinkproject.api_demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
//JpaRepository<ModelClass, DataType of Primary Key or ID>
}
