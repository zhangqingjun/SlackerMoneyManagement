package com.automatic.financing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FinancingApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinancingApplication.class, args);
    }
}
