package com.flight.service;

import java.util.List;
import java.util.Optional;


import com.flight.entities.Users;
import com.flight.exceptions.UserNotFoundException;
import com.flight.exceptions.ValueNotFoundException;

public interface UsersService {
	public List<Users> getUsers();
	public Users addUsers(Users users) throws ValueNotFoundException;
	public Users updateUsers(Users users);
	public Users getUserById(int id)throws UserNotFoundException;
	public List<Users> GetRelatedUser();
	public List<Users> GetUserName();
	

}
