package com.tinhpt.controller;

import com.tinhpt.dao.UserDAO;
import com.tinhpt.entity.User;
import com.tinhpt.model.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by septechuser on 26/12/2016.
 */
@CrossOrigin
@RestController
public class UserController {
    @Autowired
    UserDAO userDAO;

    @RequestMapping(value="/admin", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    @ResponseBody
    public boolean login(@RequestBody Credentials credentials) {
        if (credentials.getUsername().equals("admin") && credentials.getPassword().equals("1234"))
            return true;
        else return false;
    }

}
