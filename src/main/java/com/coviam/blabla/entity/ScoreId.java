package com.coviam.blabla.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ScoreId implements Serializable{
	@Column(name="merchant_id")
	long merchantId;
	@Column(name="product_id")
	int productId;
}