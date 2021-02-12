package com.tts.introtospringbootttshw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feline {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
    private String catBreed;
    private String catName; 
    private String catGender;
    private String catFavToy;
    
    public Feline() {}
    
    public Feline(String catBreed, String catName, String catGender, String catFavToy) {
    	this.catBreed = catBreed;
    	this.catName = catName;
    	this.catGender = catGender;
    	this.catFavToy = catFavToy;
    }

	public String getCatBreed() {
		return catBreed;
	}

	public void setCatBreed(String catBreed) {
		this.catBreed = catBreed;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatGender() {
		return catGender;
	}

	public void setCatGender(String catGender) {
		this.catGender = catGender;
	}

	public String getCatFavToy() {
		return catFavToy;
	}

	public void setCatFavToy(String catFavToy) {
		this.catFavToy = catFavToy;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Feline [id=" + id + ", catBreed=" + catBreed + ", catName=" + catName + ", catGender=" + catGender
				+ ", catFavToy=" + catFavToy + "]";
	}
    
    
    
}
