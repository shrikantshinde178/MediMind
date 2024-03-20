package com.mediremind.mediremind.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediremind.mediremind.entity.Admin;
import com.mediremind.mediremind.service.AdminService;
import com.mediremind.mediremind.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository arepo;
	
// ------------------------------------------------------------------------------------------------
	
	@Override
	public Admin registerAdmin(Admin newAdmin) {
		return arepo.save(newAdmin);
	}
	
// ------------------------------------------------------------------------------------------------

	 @Override
	 public Admin updateAdminDetails(Admin existingAdmin, long adminId) {
	     Admin adminToUpdate = ((Optional<Admin>) arepo.findById(adminId))
	          .orElseThrow(() -> new RuntimeException("Admin not found with id: " + adminId));
	     adminToUpdate.setPassword(existingAdmin.getPassword());
	     adminToUpdate.setHospitalAddress(existingAdmin.getHospitalAddress());
	     adminToUpdate.setPinCode(existingAdmin.getPinCode());
	     return arepo.save(adminToUpdate);
	 }
	
// ------------------------------------------------------------------------------------------------
	 
	 @Override
	    public Admin fetchAdminDetailsByName(String adminName) {
	        return arepo.findByAdminName(adminName);
	    }
	 
// ------------------------------------------------------------------------------------------------

	    @Override
	    public Admin fetchAdminDetailsById(Long adminId) {
	        return arepo.findById(adminId)
	                .orElseThrow(() -> new RuntimeException("Admin not found with id: " + adminId));
	    }

// ------------------------------------------------------------------------------------------------
	    
	    @Override
	    public List<Admin> fetchAllAdmin() {
	    	return arepo.findAll();
	    }
	
}
