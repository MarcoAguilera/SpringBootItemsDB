package com.csumb.edu.Items.resource;

import java.util.List;

import com.csumb.edu.Items.document.Items;
import com.csumb.edu.Items.repo.ItemsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")

public class ItemsResource {
    @Autowired
    private ItemsRepository repo;

    @CrossOrigin(origins = "*")
    @GetMapping("/all")
    public List<Items> getAll() {
        System.out.println("Getting All Items....");
        return repo.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/create")
    public Items postItem(@RequestBody Items item) {
        Items _item = repo.save(item);
        return _item;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/update")
    public Items updateItem(@RequestBody Items item) {
        Items _item = repo.save(item);
        return _item;
    }
}

