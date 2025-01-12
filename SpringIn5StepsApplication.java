package com.spring.basics.spring_in_5_steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {125, 4, 6}, 3);
		System.out.println(result);
		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
