package com.race.race.controller;
import com.race.race.entites.Api;
import com.race.race.services.ApiService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/superadmin")
@CrossOrigin(origins ="http://localhost:3000")
public class ApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping
    public List<Api> getAllUser() {
        return this.apiService.getallUser();
    }

    @GetMapping("/{id}")
    public Api getById(@PathVariable("id") long id) {
        return this.apiService.getbyidUser(id);
    }


    @PostMapping
    public Api getUpdate(@RequestBody Api api) {
        Api a = this.apiService.addUser(api);
        return a;
    }

    @DeleteMapping("/{ApiId}")
    public void deleteuser(@PathVariable("ApiId") long ApiId) {

        this.apiService.deleteUser(ApiId);
    }

    @PutMapping("/{Apiid}")
    public Api putUser(@RequestBody Api api, @PathVariable("Apiid") long Apiid) {
        this.apiService.updateUser(api, Apiid);
        return api;
    }
}




