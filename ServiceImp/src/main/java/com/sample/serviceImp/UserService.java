package com.sample.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.model.User;
import com.sample.repository.UserRepository;

@Service
public class UserService implements com.sample.serviceApi.UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User save(User user) {
		user = userRepository.saveAndFlush(user);
		return user;
	}

	@Override
	public boolean save(org.springframework.security.core.userdetails.User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
