package com.coviam.blabla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coviam.blabla.entity.Merchant;
import com.coviam.blabla.entity.Score;
import com.coviam.blabla.service.MerchantServiceInterface;

@RestController
public class MerchantController {
	
	@Autowired
	MerchantServiceInterface msi;
	
	private Merchant merchant;
	private Score score;
	
	@RequestMapping("/")
	public String index(){
        return "Greetings from BlaBla";
	}
	
    	@RequestMapping("/merchant")
    	public String Merchantindex(){
            return "Greetings from Merchant";
	}
}
