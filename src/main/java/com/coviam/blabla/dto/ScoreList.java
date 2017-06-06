package com.coviam.blabla.dto;

import java.util.List;

public class ScoreList {
	
	List<IdandScore> idandscore;

	public ScoreList(List<IdandScore> idandscore) {
		super();
		this.idandscore = idandscore;
	}

	public List<IdandScore> getIdandscore() {
		return idandscore;
	}

	public void setIdandscore(List<IdandScore> idandscore) {
		this.idandscore = idandscore;
	}
	
}
