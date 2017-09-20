package com.sample.test;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.model.User;
import com.sample.serviceApi.UserService;

@RunWith(SpringRunner.class)
public class TestUserController {
	
	
	@Autowired
	UserService userService;
	

		@Test
		@RequestMapping(value = "/user/add", method = RequestMethod.POST)
		public ResponseEntity<?> saveUser(@RequestBody User user) throws IOException {
			try {
				if (user != null) {
					userService.save(user);
					return ResponseEntity.ok("User saved");
				}
				return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	
}
