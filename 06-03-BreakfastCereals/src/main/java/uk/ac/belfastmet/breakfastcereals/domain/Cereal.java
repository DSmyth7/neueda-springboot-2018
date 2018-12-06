package uk.ac.belfastmet.breakfastcereals.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cereal {
	@Id
	@GeneratedValue
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cerealId;
	private String manufacturer, cereal;
	private Integer energy, calories;
	private Double protein, carbohydrate, sugars, fat, saturates, fibre, sodium, salt, iron;

	public Cereal() {
		super();
	}

	public Cereal(Integer cerealId, String manufacturer, String cereal, Integer energy, Integer calories, Double protein,
			Double carbohydrate, Double sugars, Double fat, Double saturates, Double fibre, Double sodium, Double salt,
			Double iron) {
		super();
		this.cerealId = cerealId;
		this.manufacturer = manufacturer;
		this.cereal = cereal;
		this.energy = energy;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrate = carbohydrate;
		this.sugars = sugars;
		this.fat = fat;
		this.saturates = saturates;
		this.fibre = fibre;
		this.sodium = sodium;
		this.salt = salt;
		this.iron = iron;
	}

	public Integer getCerealId() {
		return cerealId;
	}

	public void setCerealId(Integer cerealId) {
		this.cerealId = cerealId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCereal() {
		return cereal;
	}

	public void setCereal(String cereal) {
		this.cereal = cereal;
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Double getProtein() {
		return protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	public Double getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(Double carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public Double getSugars() {
		return sugars;
	}

	public void setSugars(Double sugars) {
		this.sugars = sugars;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Double getSaturates() {
		return saturates;
	}

	public void setSaturates(Double saturates) {
		this.saturates = saturates;
	}

	public Double getFibre() {
		return fibre;
	}

	public void setFibre(Double fibre) {
		this.fibre = fibre;
	}

	public Double getSodium() {
		return sodium;
	}

	public void setSodium(Double sodium) {
		this.sodium = sodium;
	}

	public Double getSalt() {
		return salt;
	}

	public void setSalt(Double salt) {
		this.salt = salt;
	}

	public Double getIron() {
		return iron;
	}

	public void setIron(Double iron) {
		this.iron = iron;
	}
	
	

	
	

}