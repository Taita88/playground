package net.tibor;

import net.tibor.repository.RoleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"net.tibor.domain"})
public class PollsApplication {

    public static void main(String... args){
        SpringApplication.run(PollsApplication.class, args);
    }

}
