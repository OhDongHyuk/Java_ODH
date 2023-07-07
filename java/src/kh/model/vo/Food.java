package kh.model.vo;

import java.io.Serializable;

import lombok.ToString;

@ToString
public class Food implements Serializable{
	
	private static final long serialVersionUID = 137762298930870879L;
	private String name;
	private int kcal;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}

	
	
}
