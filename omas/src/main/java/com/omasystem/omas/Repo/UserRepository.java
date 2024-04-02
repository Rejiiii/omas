package com.omasystem.omas.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omasystem.omas.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

    // @Query("Select u FROM tbl_user u WHERE u.course.course_id = :course_id")
    Optional<User> findByUsername(String username);

}
