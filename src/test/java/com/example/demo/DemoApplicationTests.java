package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.data.CSV;
import com.example.demo.repository.PlayersRepository;

@SpringBootTest
class DemoApplicationTests {
		
		@Autowired
		PlayersRepository playerRepo;
		@Test
		void contextLoads() {
		}
		
		@Test
		void read() throws Exception {
			CSV check = new CSV();
			
			playerRepo.saveAll(check.reader());
		}

}
