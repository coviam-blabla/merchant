package com.coviam.blabla.service;

import com.coviam.blabla.entity.Merchant;
import com.coviam.blabla.entity.Score;

public interface MerchantServiceInterface {
	Iterable<Merchant> getMerchantDetails();
	void getScores();
	void setMerchantRating(Merchant m, double newRating);
	void generateScores(Score sc);
	}