package com.mediremind.mediremind.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediremind.mediremind.entity.Admin;
import com.mediremind.mediremind.service.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
	@Autowired
    AdminService adminService;

    @PostMapping("/register")
    public ResponseEntity<Admin> registerAdmin(@RequestBody Admin newAdmin) {
        Admin createdAdmin = adminService.registerAdmin(newAdmin);
        return new ResponseEntity<>(createdAdmin, HttpStatus.CREATED);
    }

    @PutMapping("/update/{adminId}")
    public ResponseEntity<Admin> updateAdminDetails(@RequestBody Admin existingAdmin, @PathVariable long adminId) {
        Admin updatedAdmin = adminService.updateAdminDetails(existingAdmin, adminId);
        return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
    }

    @GetMapping("/detailsByname/{adminName}")
    public ResponseEntity<Admin> fetchAdminDetailsByName(@PathVariable String adminName) {
        Admin admin = adminService.fetchAdminDetailsByName(adminName);
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }

    @GetMapping("/detailsById/{adminId}")
    public ResponseEntity<Admin> fetchAdminDetailsById(@PathVariable Long adminId) {
        Admin admin = adminService.fetchAdminDetailsById(adminId);
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }
    
    @GetMapping("/fetchAllDetails")
    public ResponseEntity<List<Admin>> fetchAllAdmins() {
        List<Admin> admins = adminService.fetchAllAdmin();
        return ResponseEntity.ok(admins);
    }


}
