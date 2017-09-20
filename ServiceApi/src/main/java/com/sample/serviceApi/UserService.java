package com.sample.serviceApi;

import org.springframework.security.core.userdetails.User;

public interface UserService {

	boolean save(User user);

	com.sample.model.User save(com.sample.model.User user);

}
