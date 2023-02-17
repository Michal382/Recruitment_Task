package com.recruitment.Recruitment_Task;

import com.recruitment.Recruitment_Task.repository.AddressRepository;
import com.recruitment.Recruitment_Task.repository.UserRepository;
import com.recruitment.Recruitment_Task.user.Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RecruitmentTaskApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  configurableApplicationContext = SpringApplication.run(RecruitmentTaskApplication.class, args);

		AddressRepository addressRepository = configurableApplicationContext.getBean(AddressRepository.class);
		UserRepository userRepository = configurableApplicationContext.getBean(UserRepository.class);

	}

}
