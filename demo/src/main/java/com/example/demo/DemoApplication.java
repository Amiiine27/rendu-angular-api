package com.example.demo;

import com.example.demo.domain.Tournament;
import com.example.demo.repo.TournamentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private TournamentRepo tournamentRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
