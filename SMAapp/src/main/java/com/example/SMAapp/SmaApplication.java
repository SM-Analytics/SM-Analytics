package com.example.SMAapp;

import com.example.SMAapp.machine.Machine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmaApplication.class, args);
	}
}
