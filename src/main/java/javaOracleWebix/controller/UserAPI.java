package javaOracleWebix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javaOracleWebix.service.UserService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/user")
public class UserAPI {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/getAllUser")
	ResponseEntity<?> getAllKhachHang()
	{
		return ResponseEntity.ok(service.getAllUsers());
	}	
	
	@GetMapping("/getUserById")
	ResponseEntity<?> getUserById(@RequestParam("id") int id)
	{
		return ResponseEntity.ok(service.getUserById(id));
	}	
	
	@GetMapping("/getUserByRole")
	ResponseEntity<?> getUserById(@RequestParam("id") String id)
	{	System.out.println(id);
		return ResponseEntity.ok(service.getUserByRole(id));
	}
	
	@GetMapping("/getUserByRoleUse")
	ResponseEntity<?> getUserByRoleUse(@RequestParam("id") String id){
		return ResponseEntity.ok(service.getUserByRoleUse(id));
	}
	
	@GetMapping("/getUserByRoleUse11")
	ResponseEntity<?> getUserByRoleUse11(@RequestParam("id") String id){
		return ResponseEntity.ok(service.getUserByRoleUse(id));
	}
	@GetMapping("/getUserByRoleUse111")
	ResponseEntity<?> getUserByRoleUse111(@RequestParam("id") String id){
		return ResponseEntity.ok(service.getUserByRoleUse(id));
	}
}
