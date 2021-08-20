package com.hope.red.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hope.red.models.User;
import com.hope.red.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
// -------------------- CRUD USERS ---------------------------//
	
	// REGISTER USER AND HASH THEIR PASSWORD
    public User registerUser(User user) {
    	// Take plain text password and turn it into a hashed version 
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepo.save(user);
    }
    
    // FIND USER BY EMAIL
    public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }
    
    // FIND USER BY ID
    public User findUserById(Long id) {
    	return userRepo.findById(id).orElse(null);
    }
    
    // AUTHENTICATE USER
    public boolean authenticateUser(String email, String password) {
        // Find the user by email
        User user = userRepo.findByEmail(email);
        // If not found by email, return false
        if(user == null) {
            return false;
        } else {
            // If the passwords match, return true, else, return false
            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
	
}
