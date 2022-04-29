package com.flight.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entities.Users;

import com.flight.exceptions.UserNotFoundException;
import com.flight.exceptions.ValueNotFoundException;
import com.flight.service.UsersService;

@RestController
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/users")
	public List<Users> getUsers(){
		return this.usersService.getUsers();
	}
	
	@PostMapping("/users")
	public ResponseEntity addUsers(@RequestBody Users users)throws ValueNotFoundException {
		Users u =  usersService.addUsers(users);
		return new ResponseEntity<>(u, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/users")
	public Users updateUsers(@RequestBody Users users) {
		return this.usersService.updateUsers(users);
	}
	
	@GetMapping("/users/{usersid}")
	public ResponseEntity getUserById(@PathVariable("usersid") int id){
		return new ResponseEntity(usersService.getUserById(id), HttpStatus.OK);
	}
	
	@GetMapping("/relateduser")
	public List<Users> GetRelatedUser(){
		return this.usersService.GetRelatedUser();
	}
	
	@GetMapping("/kname")
	public List<Users> GetUserName(){
		return this.usersService.GetUserName();
	}

}
