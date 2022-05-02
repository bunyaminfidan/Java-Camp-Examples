package gameProject.Entities.Concrete;

import java.sql.Date;

import gameProject.Entities.Abstract.Entity;

public class Campaign implements Entity {

	private int id;
	private String name;
	private double rate;
	private Date expriyDate;

	public Campaign() {
		super();
	}

	public Campaign(int id, String name, double rate, Date expriyDate) {
		super();
		this.id = id;
		this.name = name;
		this.rate = rate;
		this.expriyDate = expriyDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Date getExpriyDate() {
		return expriyDate;
	}

	public void setExpriyDate(Date expriyDate) {
		this.expriyDate = expriyDate;
	}

}
