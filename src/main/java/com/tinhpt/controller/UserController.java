package com.tinhpt.controller;

import com.tinhpt.dao.UserDAO;
import com.tinhpt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by septechuser on 23/12/2016.
 */
@RestController
@RequestMapping("/accounts")
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
