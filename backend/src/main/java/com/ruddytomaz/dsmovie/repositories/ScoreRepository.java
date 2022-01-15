package com.ruddytomaz.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruddytomaz.dsmovie.entities.Score;
import com.ruddytomaz.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
