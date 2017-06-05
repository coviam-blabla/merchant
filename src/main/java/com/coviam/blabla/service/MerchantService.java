package com.coviam.blabla.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coviam.blabla.dao.MerchantRepository;
import com.coviam.blabla.dao.ScoreRepository;
import com.coviam.blabla.entity.Merchant;
import com.coviam.blabla.entity.Score;

@Service
public class MerchantService implements MerchantServiceInterface {

	@Autowired
	private MerchantRepository mr;
	@Autowired
	private ScoreRepository sr;
	
	@Override
	public Iterable<Merchant> getMerchantDetails() {
		// TODO Auto-generated method stub 
		return mr.findAll();
	}

	@Override
	public void getScores() {
		// TODO Auto-generated method stub
	}

	@Override
	public void generateScores(Score sc) {
		double currScore=sc.getCalcScore();
		int param1=sc.getParam1();
		int param2=sc.getParam2();
		int param3=sc.getParam3();
		double param4=sc.getParam4();
		double param5=sc.getParam5();
		double param6=sc.getParam6();
		double newScore=param1+(2*param2)+param3+(3*param4)-(5*param5)+(8*param6);
		sc.setCalcScore(newScore);
		sr.save(sc);
	}

	@Override
	public void setMerchantRating(Merchant m,double newRating){
		double currRating= m.getMerchantRating();
		int counter=m.getRatingCounter();
		currRating=((currRating*counter)+newRating)/(counter+1);
		m.setMerchantRating(currRating);
		mr.save(m);
	}
}
