package com.coviam.blabla.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coviam.blabla.entity.Score;

@Repository
public interface ScoreRepository extends CrudRepository<Score,String>{

}
