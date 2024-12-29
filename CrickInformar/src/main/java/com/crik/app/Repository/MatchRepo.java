package com.crik.app.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crik.app.Entity.Match;

public interface MatchRepo extends JpaRepository<Match,Integer> {

	Optional<Match> findByTeamHeading(String teamHeading);
	
}
