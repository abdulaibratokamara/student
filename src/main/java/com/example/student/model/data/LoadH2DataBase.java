package com.example.student.model.data;

import com.example.student.model.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.slf4j.SLF4JLogger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadH2DataBase {


    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        return args -> {
            System.out.println("Preloading " + repository.save(new User("user1", "1234")));
            System.out.println("Preloading " + repository.save(new User("user2", "2345")));
            System.out.println("Preloading " + repository.save(new User("user3", "3456")));
        };
    }
}
