package com.csumb.edu.Items.repo;

import com.csumb.edu.Items.document.Items;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends MongoRepository<Items, String>{ 
}