package com.coviam.blabla.service;

import java.util.List;
import com.coviam.blabla.dto.MerchantDTO;
import com.coviam.blabla.dto.RatingList;
import com.coviam.blabla.dto.ScoreList;
import com.coviam.blabla.entity.Merchant;
import com.coviam.blabla.entity.Score;

public interface MerchantServiceInterface {
	void getScores();
	void updateMerchantRating(RatingList ratinglist);
	void generateScores(ScoreList scorelist);
	Iterable<Merchant> getMerchantDetails(List<Long> merchantId);
	}