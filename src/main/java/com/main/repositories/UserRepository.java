package com.main.repositories;

import com.main.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by munna on 10/10/16.
 */

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    public User findByUserName(String userName);
}
