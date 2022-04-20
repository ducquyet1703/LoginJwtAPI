package com.dts.loginjwtapi;

import com.dts.loginjwtapi.users.User;
import com.dts.loginjwtapi.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class LoginJwtApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LoginJwtApiApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        // Khi chương trình chạy
        // Insert vào csdl một user.
        User user = new User();
        user.setUsername("dts");
        user.setPassword(passwordEncoder.encode("123456"));
        userRepository.save(user);
        System.out.println(user);
    }

}
