package com.musicapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musicapp.model.User;
import com.musicapp.payload.UserDto;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {
	
	

	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
		
		UserDto createdUser = new UserDto();
		return new ResponseEntity<UserDto>(createdUser, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getUserById(@PathVariable("userId") Integer userId){
		return ResponseEntity.ok(new UserDto());
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userData, @PathVariable("userId") Integer userId){
		UserDto updatedUser = new UserDto();
		return new ResponseEntity<UserDto>(updatedUser,HttpStatus.OK);
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable("userId") Integer userId){
		this.userService.deleteUser(userId);
		
		return new ResponseEntity(Map.of("message" , "user deleted successfully"), HttpStatus.OK);
	}

}
