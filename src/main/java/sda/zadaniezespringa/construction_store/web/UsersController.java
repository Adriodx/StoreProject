package sda.zadaniezespringa.construction_store.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sda.zadaniezespringa.construction_store.model.User;
import sda.zadaniezespringa.construction_store.service.UserService;

import java.util.List;



    @Slf4j
    @RestController
    @AllArgsConstructor
    @RequestMapping("/api/users")
    public class UsersController {

        private final UserService userService;


        @Transactional
        @GetMapping("/all")
        public ResponseEntity<List<User>> getAll() {
            List<User> users = userService.getAll();

            return ResponseEntity.ok(userService.getAll());
        }

        @PostMapping
        public ResponseEntity<User> save(@RequestBody User user) {
            return ResponseEntity.ok(userService.save(user));
        }

    }



