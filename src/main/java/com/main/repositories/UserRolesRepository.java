package com.main.repositories;

import com.main.domain.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by munna on 10/10/16.
 */

@Repository
public interface UserRolesRepository extends CrudRepository<Role,Long> {

    @Query("select a.role from Role a, User b where b.userName=?1 and a.userId = b.userId")
    public List<String> findRoleByUserName(String userName);
}
