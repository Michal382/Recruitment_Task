package com.recruitment.Recruitment_Task.user;

import com.recruitment.Recruitment_Task.user.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
public interface AdressRepository extends CrudRepository<Adress, Integer>{
}
