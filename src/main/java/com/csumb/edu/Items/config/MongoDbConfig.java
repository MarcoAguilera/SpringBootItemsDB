// package com.csumb.edu.Items.config;

// import com.csumb.edu.Items.document.Items;
// import com.csumb.edu.Items.repo.ItemsRepository;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

// @EnableMongoRepositories(basePackageClasses = ItemsRepository.class)
// @Configuration
// public class MongoDbConfig {
//     @Bean
//     CommandLineRunner commandLineRunner(ItemsRepository itemsRepository ) {
//         return args -> {
//             itemsRepository.save(new Items("1", 1, 1.00, "1", "1"));
//         };
//     }
// }