package com.sample.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.User;
com.sample.serviceApi.UserService



@RestController
public class UserController {

	@Autowired
	UserService UserService;

	/** This method is created for add a new user 
	 * @param user
	 * @return
	 * @throws IOException
	 */
	
	@RequestMapping(value = "/user/add", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody User user) throws IOException {
		try {
			if (user != null) {
			/*	UserService.save(user);*/
				return ResponseEntity.ok("User saved");
			}
			return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
