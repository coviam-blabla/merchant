package com.coviam.blabla.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="score")
public class Score implements Serializable{
	@EmbeddedId ScoreId id;
	@Column(name="param1")
	int param1;
	@Column(name="param2")
	int param2;
	@Column(name="param3")
	int param3;
	@Column(name="param4")
	double param4;
	@Column(name="param5")
	double param5;
	@Column(name="param6")
	double param6;
	@Column(name="calc_score")
	double calcScore;
	
	public double getCalcScore() {
		return calcScore;
	}
	public void setCalcScore(double calcScore) {
		this.calcScore = calcScore;
	}
	public ScoreId getId() {
		return id;
	}
	public void setId(ScoreId id) {
		this.id = id;
	}
	public int getParam1() {
		return param1;
	}
	public void setParam1(int param1) {
		this.param1 = param1;
	}
	public int getParam2() {
		return param2;
	}
	public void setParam2(int param2) {
		this.param2 = param2;
	}
	public int getParam3() {
		return param3;
	}
	public void setParam3(int param3) {
		this.param3 = param3;
	}
	public double getParam4() {
		return param4;
	}
	public void setParam4(double param4) {
		this.param4 = param4;
	}
	public double getParam5() {
		return param5;
	}
	public void setParam5(double param5) {
		this.param5 = param5;
	}
	public double getParam6() {
		return param6;
	}
	public void setParam6(double param6) {
		this.param6 = param6;
	}
	@Override
	public String toString() {
		return "Score [id=" + id + ", param1=" + param1 + ", param2=" + param2 + ", param3=" + param3 + ", param4="
				+ param4 + ", param5=" + param5 + ", param6=" + param6 + ", calcScore=" + calcScore + "]";
	}
		}
