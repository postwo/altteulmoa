package com.cos.alttmoa.repository.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.alttmoa.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
