package com.cth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CTHApp {

    public static void main(String[] args) {
        // This launches the application. After executing this command, your application will listen to
        // requests on the configured port (8080) and execute the code that is configured for
        // its route: "/simple" and "/greeting" if a request comes in.
        // Later it could do other things too, like execute a function every X seconds.
        SpringApplication.run(CTHApp.class, args);
    }
}
