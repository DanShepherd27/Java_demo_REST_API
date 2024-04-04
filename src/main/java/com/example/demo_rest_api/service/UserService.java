package com.example.demo_rest_api.service;

import com.example.demo_rest_api.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Dan", 23, "dani@mail.hu");
        User user2 = new User(2, "Hannah", 13, "hanna@mail.hu");
        User user3 = new User(3, "Esther", 25, "dani@mail.hu");

        userList.addAll(Arrays.asList(user1, user2, user3));
    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user: userList) {
            if(id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
