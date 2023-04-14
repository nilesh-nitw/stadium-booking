//package com.example.demo.customer;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class CustomerConfig {
//    @Bean //setup basic config for customer
//    CommandLineRunner commandLineRunner (CustomerRepository repository){
//        return args -> {
//            Customer customer1 = new Customer(
//                    "John",
//                    "Doe"
//            );
//            Customer customer2 = new Customer(
//                    "Jane",
//                    "Doe"
//            );
//        repository.saveAll(
//                List.of(customer1,
//                        customer2)
//            );
//        };
//
//    }
//}