package com.recruitment.Recruitment_Task.user;

import com.recruitment.Recruitment_Task.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends  CrudRepository<User, Integer>{
}
