package com.crik.app.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crik.app.Entity.Match;
@Service
public interface MatchService {

	List<Match> getAllMatches();
	
	List<Match> getLiveMatches();
	
	List<List<String>> getPointTable();
}
