package com.omasystem.omas.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.omasystem.omas.Entity.User;
import com.omasystem.omas.Entity.tbl_user;

public interface UserRepository extends JpaRepository<tbl_user, Long>{

    // @Query("Select u FROM tbl_user u WHERE u.course.course_id = :course_id")
    Optional<tbl_user> findByUsername(String username);

}
