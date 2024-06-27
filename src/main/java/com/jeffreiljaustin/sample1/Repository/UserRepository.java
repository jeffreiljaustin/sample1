package com.jeffreiljaustin.sample1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffreiljaustin.sample1.Model.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
