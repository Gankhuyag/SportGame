package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import  domain.Team;
import  domain.Stadium;

public interface TeamRepository extends JpaRepository<Team, Long>{
	@Query("Select a from Team")
	public List<Team> getAllTeam();
	
  }
