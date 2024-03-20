package com.mediremind.mediremind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediremind.mediremind.entity.Admin;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	Admin findByAdminName(String adminName);

	Admin save(Admin newAdmin);

	Object findById(long adminId);	
	

}
