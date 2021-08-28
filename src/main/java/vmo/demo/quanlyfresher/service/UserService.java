package vmo.demo.quanlyfresher.service;


import vmo.demo.quanlyfresher.entity.User;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	 
    User findById(Long id);

    User findByUsername(String username);

    User findByEmail(String email);

    void save(User user);

    User createUser(String username, String email,  String password, List<String> roles);

}
