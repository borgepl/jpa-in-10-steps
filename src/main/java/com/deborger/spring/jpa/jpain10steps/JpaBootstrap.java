package com.deborger.spring.jpa.jpain10steps;

import com.deborger.spring.jpa.jpain10steps.entity.User;
import com.deborger.spring.jpa.jpain10steps.entity.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JpaBootstrap implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(JpaBootstrap.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) {

        // load users in
        User user =  new User("Jill","Admin");
        userRepository.save(user);
        log.info("New user created : " + user);

        Optional<User> user1 = userRepository.findById(1L);
        log.info("User retrieved : " + user1);

        List<User> users = userRepository.findAll();
        log.info("All users : " + users);

        long count = userRepository.count();
        log.info("Total users : " + count);
    }
}
