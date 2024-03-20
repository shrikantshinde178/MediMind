package com.mediremind.mediremind.service;

import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.mediremind.mediremind.entity.Admin;

@Configuration
public interface AdminService {

	Admin registerAdmin(Admin newAdmin);
	
	Admin updateAdminDetails(Admin existingAdmin, long adminId);
	
	Admin fetchAdminDetailsByName(String adminName);

	Admin fetchAdminDetailsById(Long adminId);
	
	List<Admin> fetchAllAdmin();
	
}
