package com.flight1;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.flight.dao.UserDAO;
import com.flight.entities.Users;
import com.flight.service.UsersServiceImpl;


public class TestUser {
	
	@InjectMocks
	UsersServiceImpl usersServiceImpl;
	
	@Mock
	UserDAO dao;
	
	@Test
	public void createUsersTest() {
		MockitoAnnotations.initMocks(this);
		Users users = new Users(3,"Rahul45","RH4560","Rahul","Vijay","Rahulv@gmail.com");
		usersServiceImpl.addUsers(users);
		verify(dao, times(1)).save(users);
	}

}
