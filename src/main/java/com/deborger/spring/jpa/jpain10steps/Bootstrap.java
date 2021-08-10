package com.deborger.spring.jpa.jpain10steps;

import com.deborger.spring.jpa.jpain10steps.dao.UserDaoService;
import com.deborger.spring.jpa.jpain10steps.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Bootstrap.class);

    @Autowired
    private UserDaoService userDaoService;

    @Override
    public void run(String... args) throws Exception {

        // load users in
        User user =  new User("Jack","Admin");
        Long insert = userDaoService.insert(user);
        log.info("New user created : " + insert);
    }
}
