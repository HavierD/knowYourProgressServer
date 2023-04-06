package dev.havier.knowyourprogressbackendspring;

import dev.havier.knowyourprogressbackendspring.entity.AasB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class KnowYourProgressBackendSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(KnowYourProgressBackendSpringApplication.class, args);

        var a = new AasB();
    }

}
