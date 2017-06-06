package com.coviam.blabla.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coviam.blabla.dao.MerchantRepository;
import com.coviam.blabla.dao.ScoreRepository;
import com.coviam.blabla.dto.IdandRating;
import com.coviam.blabla.dto.RatingList;
import com.coviam.blabla.dto.ScoreList;
import com.coviam.blabla.entity.Merchant;

@Service
public class MerchantService implements MerchantServiceInterface {

	@Autowired
	private MerchantRepository merchantrepository;
	@Autowired
	private ScoreRepository scorerepository;
	
	
	@Override
	public Iterable<Merchant> getMerchantDetails(List<Long> merchantId) {
		// TODO Auto-generated method stub 
		return merchantrepository.findAll(merchantId);
	}

	@Override
	public void getScores() {
		// TODO Auto-generated method stub
	}

	@Override
	public void generateScores(ScoreList scorelist) {
//		List<IdandScore> idScoreList = scorelist.getIdandscore();
//		for(IdandScore idandscore : idScoreList){
//			double Score=idandscore.get
//			int param1=sc.getParam1();
//			int param2=sc.getParam2();
//			int param3=sc.getParam3();
//			double param4=sc.getParam4();
//			double param5=sc.getParam5();
//			double param6=sc.getParam6();
//			double newScore=param1+(2*param2)+param3+(3*param4)-(5*param5)+(8*param6);
//			sc.setCalcScore(newScore);
//			scorerepository.save(sc);
//	}
		}
	
	@Override
	public void updateMerchantRating(RatingList ratinglist) {
		List<IdandRating> idratinglist = ratinglist.getIdandRating();
 		for(IdandRating idandrating : idratinglist)
		{
 			long merchantId=idandrating.getMerchantId();
 			double newRating=idandrating.getMerchantRating();
 			Merchant merchant = merchantrepository.findOne(merchantId);
 			double currentRating=merchant.getMerchantRating();
 			int counter=merchant.getRatingCounter();
 			currentRating=((currentRating*counter)+newRating)/(counter+1);
 			merchant.setRatingCounter(counter+1);
 			merchant.setMerchantRating(currentRating);
 			merchantrepository.save(merchant);
		}
	}
}
