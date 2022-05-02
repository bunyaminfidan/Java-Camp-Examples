package gameProject.Entities.Concrete;

import java.sql.Date;

import gameProject.Entities.Abstract.Entity;

public class Game implements Entity {
	private int id;
	private String name;
	private String detail;
	private double unitPrice;
	private Date releaseYear;

	public Game() {
		super();
	}

	public Game(int id, String game, String detail, double unitPrice, Date releaseYear) {
		super();
		this.id = id;
		this.name = game;
		this.detail = detail;
		this.unitPrice = unitPrice;
		this.releaseYear = releaseYear;
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

	public void setName(String game) {
		this.name = game;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Date releaseYear) {
		this.releaseYear = releaseYear;
	}

}
