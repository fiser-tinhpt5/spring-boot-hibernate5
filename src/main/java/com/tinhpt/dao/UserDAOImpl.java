package com.tinhpt.dao;

import com.tinhpt.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by septechuser on 23/12/2016.
 */

@Repository("userDAO")
public class UserDAOImpl extends AbstractDAO<User, Long> implements UserDAO{

}
