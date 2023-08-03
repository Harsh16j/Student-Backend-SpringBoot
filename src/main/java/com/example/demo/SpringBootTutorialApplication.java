package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

@SpringBootApplication
//@RestController
public class SpringBootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}


//	@GetMapping
//	public List<Student> hello(){
//		return List.of(
//				new Student(
//						1L,
//						"Harsh",
//						"harsh@abc.com",
//						LocalDate.of(2000, Month.JANUARY,5),
//						21
//				)
//		);
//	}

//	@GetMapping
//	public String hello(){
//		return "Hello World";
//	}
}
