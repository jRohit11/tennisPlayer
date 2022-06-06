package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Players;

public interface PlayersRepository  extends JpaRepository<Players, Integer>{
	
	List<Players> findByName(String name);
	
    @Query("FROM Players ORDER BY playerRanking DESC")
    List<Players> findAllOrderByRankDesc();
}
