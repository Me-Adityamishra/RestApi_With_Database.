package com.RestApi.Service;


import com.RestApi.Entity.User;
import com.RestApi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class UserService {

        @Autowired
        private UserRepository userRepository;

        public User createUser(User user) {
            return userRepository.save(user);
        }

        public List<User> getAllUsers() {
            return userRepository.findAll();
        }

        public User getUserById(Long id) {
            return userRepository.findById(id).orElse(null);
        }

        public User updateUser(Long id, User user) {
            user.setId(id);
            return userRepository.save(user);
        }

        public void deleteUser(Long id) {
            userRepository.deleteById(id);
        }
    }

