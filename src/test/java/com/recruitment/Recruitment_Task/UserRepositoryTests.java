package com.recruitment.Recruitment_Task;

import com.recruitment.Recruitment_Task.repository.UserRepository;
import com.recruitment.Recruitment_Task.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
    @Autowired private UserRepository repo;

    @Test
    public void testAddNew(){
        User user = new User();
        user.setEmail("michal2.zyw0@gmail.com");
        user.setFirstname("Michał");
        user.setLastname("Żywiczka");
        user.setPassword("12345");

        User savedUser = repo.save(user);

        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isGreaterThan(0);

    }

    @Test
    public void testAddNew2(){
        User user = new User();
        user.setEmail("Test_User_3");
        user.setFirstname("User_2_First_Name");
        user.setLastname("User_2_Last_Name");
        user.setPassword("12345");

        User savedUser = repo.save(user);

        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isGreaterThan(0);

    }

    @Test
    public void testListAll(){
        Iterable<User> users = repo.findAll();
        for(User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void testUpdate(){
        Integer userId = 1;
        Optional<User> optionalUser = repo.findById(userId);
        User user = optionalUser.get();
        user.setPassword("TestPassword");
        repo.save(user);

        User updatedUser = repo.findById(userId).get();
        assertThat(updatedUser.getPassword()).isEqualTo("TestPassword");
    }

    @Test
    public void testGetUserById(){
        Integer userId = 2;
        Optional<User> optionalUser = repo.findById(userId);
        assertThat(optionalUser).isPresent();
        System.out.println(optionalUser.get());
    }

    @Test
    public void testDeleteByID(){
        Integer userId= 2;
        repo.deleteById(userId);

        Optional<User> optionalUser = repo.findById(userId);
        assertThat(optionalUser).isNotPresent();
    }

}
