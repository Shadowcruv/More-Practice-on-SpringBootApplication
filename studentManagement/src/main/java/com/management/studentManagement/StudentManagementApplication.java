package com.management.studentManagement;
/*
import com.management.studentManagement.entity.Student;
import com.management.studentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.List;

@SpringBootApplication
public class StudentManagementApplication{



	public static void main(String[] args) {

		SpringApplication.run(StudentManagementApplication.class, args);


	}

}


