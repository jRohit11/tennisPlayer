package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Players;
import com.example.demo.repository.PlayersRepository;

@RestController
public class PlayerController {
	
	@Autowired
	private PlayersRepository playerRepo;
	
	@GetMapping("/listPlayers") 
	public List<Players> listAllPlayers(){
		
		List<Players> playersList = playerRepo.findAll();
		return playersList;
	}
	@PostMapping("/searchPlayer")
	public List<Players> searchPlayer(String name){
		List<Players> playersList = playerRepo.findByName(name);
		
		return playersList;
	}
	@GetMapping("/rankOrder")
	public List<Players>  rankOrder(){
		List<Players> playerList = playerRepo.findAllOrderByRankDesc();
		return playerList;
	}
	
	
}
